<template>
  <div>
    <h3>{{ mode === 'create' ? 'Registrar' : 'Editar' }} Cliente</h3>
    <form @submit.prevent="enviarFormulario">
      <div>
        <label>Nombres:</label>
        <input v-model="cliente.nombres" required>
      </div>
      <div>
        <label>Apellidos:</label>
        <input v-model="cliente.apellidos" required>
      </div>
      <div>
        <label>DNI:</label>
        <input v-model="cliente.dni" required>
      </div>
      <div>
        <label>Teléfono:</label>
        <input v-model="cliente.telefono">
      </div>
      <div>
        <label>Email:</label>
        <input type="email" v-model="cliente.email">
      </div>
      <button type="submit">{{ mode === 'create' ? 'Registrar' : 'Actualizar' }} Cliente</button>
    </form>
  </div>
</template>

<script>
import api from '@/api.js';

export default {
  name: 'FormularioCliente',
  props: {
    mode: {
      type: String,
      default: 'create' // 'create' o 'edit'
    },
    initialData: Object
  },
  data() {
    return {
      cliente: this.initialData || {}
    };
  },
  methods: {
    enviarFormulario() {
      if (this.mode === 'create') {
        api.post('/cliente', this.cliente)
            .then(() => {
              alert('Cliente registrado con éxito.');
              this.$emit('clienteCreado');
            })
            .catch(error => {
              console.error('Error registrando cliente:', error);
              alert('Hubo un error al registrar el cliente.');
            });
      } else {
        api.put(`/cliente/${this.cliente.id}`, this.cliente)
            .then(() => {
              alert('Cliente actualizado con éxito.');
              this.$emit('clienteActualizado');
            })
            .catch(error => {
              console.error('Error actualizando cliente:', error);
              alert('Hubo un error al actualizar el cliente.');
            });
      }
    }
  }
}
</script>
