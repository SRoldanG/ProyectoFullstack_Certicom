<template>
  <div>
    <h2>Registro de Producto</h2>
    <form @submit.prevent="registrarProducto">
      <div>
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" v-model="producto.nombre" required>
      </div>

      <div>
        <label for="precio">Precio:</label>
        <input type="number" id="precio" v-model="producto.precio" required>
      </div>

      <button type="submit">Registrar Producto</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios'; // Asegúrate de tener axios instalado y configurado

export default {
  data() {
    return {
      producto: {
        nombre: '',
        precio: null
      }
    };
  },
  methods: {
    async registrarProducto() {
      try {
        // Asume que tienes un endpoint en tu backend llamado '/producto' para registrar un nuevo producto
        const response = await axios.post('/productos', this.producto);
        if (response.data.success) {
          alert('Producto registrado con éxito!');
          // Puedes redirigir o actualizar el estado según lo necesites
        } else {
          alert('Hubo un problema al registrar el producto.');
        }
      } catch (error) {
        console.error('Error al registrar el producto:', error);
        alert('Hubo un error al registrar el producto. Por favor, inténtalo de nuevo.');
      }
    }
  }
}
</script>

<style scoped>
/* Aquí puedes agregar estilos específicos para este componente */
</style>
