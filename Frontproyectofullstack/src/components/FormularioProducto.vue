<template>
  <div>
    <h3>{{ mode === 'create' ? 'Registrar' : 'Editar' }} Producto</h3>
    <form @submit.prevent="enviarFormulario">
      <div>
        <label>Nombre:</label>
        <input v-model="producto.nombre" required>
      </div>
      <div>
        <label>Precio:</label>
        <input type="number" v-model="producto.precio" required>
      </div>
      <button type="submit">{{ mode === 'create' ? 'Registrar' : 'Actualizar' }} Producto</button>
    </form>
  </div>
</template>

<script>
import api from '@/api.js';

export default {
  name: 'FormularioProducto',
  props: {
    mode: {
      type: String,
      default: 'create' // 'create' o 'edit'
    },
    initialData: Object
  },
  data() {
    return {
      producto: this.initialData || {}
    };
  },
  methods: {
    enviarFormulario() {
      if (this.mode === 'create') {
        api.post('/producto', this.producto)
            .then(() => {
              alert('Producto registrado con éxito.');
              this.$emit('productoCreado');
            })
            .catch(error => {
              console.error('Error registrando producto:', error);
              alert('Hubo un error al registrar el producto.');
            });
      } else {
        api.put(`/producto/${this.producto.id}`, this.producto)
            .then(() => {
              alert('Producto actualizado con éxito.');
              this.$emit('productoActualizado');
            })
            .catch(error => {
              console.error('Error actualizando producto:', error);
              alert('Hubo un error al actualizar el producto.');
            });
      }
    }
  }
}
</script>