<template>
  <div>
    <h2>Lista de Productos</h2>
    <ul>
      <li v-for="producto in productos" :key="producto.id">
        {{ producto.nombre }} - ${{ producto.precio }}
        <router-link :to="`/editar-producto/${producto.id}`">Editar</router-link>
        <button @click="eliminarProducto(producto.id)">Eliminar</button>
      </li>
    </ul>
  </div>
</template>

<script>
import api from '@/api.js';

export default {
  name: 'ListaProductos',
  data() {
    return {
      productos: []
    };
  },
  created() {
    this.cargarProductos();
  },
  methods: {
    cargarProductos() {
      api.get('/productos')
          .then(response => {
            this.productos = response.data;
          })
          .catch(error => {
            console.error('Error cargando productos:', error);
          });
    },
    eliminarProducto(id) {
      if (confirm('¿Estás seguro de que deseas eliminar este producto?')) {
        api.delete(`/producto/${id}`)
            .then(() => {
              this.cargarProductos(); // Recargar la lista después de eliminar
            })
            .catch(error => {
              console.error('Error eliminando producto:', error);
              alert('Hubo un error al eliminar el producto.');
            });
      }
    }
  }
}
</script>

<style scoped>
/* Estilos de la vista ListaProductos */
</style>
