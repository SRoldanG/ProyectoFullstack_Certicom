<template>
  <div>
    <h2>Editar Cliente</h2>
    <FormularioCliente v-if="cliente" :initialData="cliente" mode="edit" @clienteActualizado="clienteActualizado" />
    <input type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">  </div>
</template>

<script>
import api from '@/api.js';
import FormularioCliente from '@/components/FormularioCliente.vue';

export default {
  name: 'EditarCliente',
  components: {
    FormularioCliente
  },
  data() {
    return {
      cliente: null
    };
  },
  created() {
    api.get(`/cliente/${this.$route.params.id}`)
        .then(response => {
          this.cliente = response.data;
        })
        .catch(error => {
          console.error('Error cargando cliente:', error);
        });
  },
  methods: {
    clienteActualizado() {
      this.$router.push('/lista-clientes');
    }
  }
}
</script>
