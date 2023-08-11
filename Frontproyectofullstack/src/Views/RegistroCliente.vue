<template>
  <div>
    <h2>Registro de Cliente</h2>
    <FormularioCliente @clienteCreado="clienteCreado" />
  </div>
</template>

<script>
import FormularioCliente from '@/components/FormularioCliente.vue';

export default {
  name: 'RegistroCliente',
  components: {
    FormularioCliente
  },
  methods: {
    clienteCreado() {
      this.$router.push('/lista-clientes'); // Redirecciona al usuario a la lista de clientes después de registrar
    }
  }
}
</script>