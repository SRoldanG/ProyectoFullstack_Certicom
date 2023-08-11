<template>
  <div>
    <h2>Ventas por Fecha</h2>
    <input type="date" v-model="fechaSeleccionada" @change="buscarVentas">
    <ul>
      <li v-for="venta in ventas" :key="venta.id">
        <router-link :to="`/venta/${venta.id}`">Venta #{{ venta.id }} para {{ venta.cliente.nombres }}</router-link>
      </li>
    </ul>
  </div>
</template>

<script>
import api from '@/api.js';

export default {
  name: 'VentasPorFecha',
  data() {
    return {
      fechaSeleccionada: '',
      ventas: []
    };
  },
  methods: {
    buscarVentas() {
      api.get(`/ventas?fecha=${this.fechaSeleccionada}`)
          .then(response => {
            this.ventas = response.data;
          });
    }
  }
}
</script>

<style scoped>
/* Estilos para la vista VentasPorFecha */
</style>