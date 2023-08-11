<template>
  <div>
    <h2>Venta para: {{ venta.cliente.nombres }} {{ venta.cliente.apellidos }}</h2>
    <p>Fecha de Venta: {{ venta.fecha }}</p>
    <DetalleVenta :detalles="venta.detalles" />
  </div>
</template>

<script>
import axios from 'axios';
import DetalleVenta from '@/components/DetalleVenta.vue';

export default {
  name: 'Venta',
  components: {
    DetalleVenta
  },
  data() {
    return {
      venta: {
        cliente: {},
        fecha: '',
        detalles: []  // Aquí se almacenarán los detalles de los productos vendidos
      }
    };
  },
  created() {
    // Aquí, por ejemplo, puedes hacer una llamada API para cargar los detalles de una venta específica usando Axios
    axios.get(`/ventas/${this.$route.params.id}`) // Suponiendo que el ID de la venta está en la URL
        .then(response => {
          this.venta = response.data;
        });
  }
}
</script>

<style scoped>
/* Aquí puedes agregar estilos específicos para la vista Venta */
</style>