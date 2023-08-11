<template>
  <div>
    <h2>Lista de Clientes</h2>
    <ul>
      <li v-for="cliente in clientes" :key="cliente.id">
        {{ cliente.nombres }} {{ cliente.apellidos }} - {{ cliente.email }}
        <router-link :to="`/editar-cliente/${cliente.id}`">Editar</router-link>
        <button @click="eliminarCliente(cliente.id)">Eliminar</button>
      </li>
    </ul>
  </div>
</template>

<script>
import api from '@/api.js';

export default {
  name: 'ListaClientes',
  data() {
    return {
      clientes: []
    };
  },
  created() {
    this.cargarClientes();
  },
  methods: {
    cargarClientes() {
      api.get('/cliente')
          .then(response => {
            this.clientes = response.data;
          })
          .catch(error => {
            console.error('Error cargando clientes:', error);
          });
    },
    eliminarCliente(id) {
      if (confirm('¿Estás seguro de que deseas eliminar este cliente?')) {
        api.delete(`/cliente/${id}`)
            .then(() => {
              this.cargarClientes(); // Recargar la lista después de eliminar
            })
            .catch(error => {
              console.error('Error eliminando cliente:', error);
              alert('Hubo un error al eliminar el cliente.');
            });
      }
    }
  }
}
</script>
