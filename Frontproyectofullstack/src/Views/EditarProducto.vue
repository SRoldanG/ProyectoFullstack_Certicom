<template>
  <div>
    <h2>Editar Producto</h2>
    <FormularioProducto v-if="producto" :initialData="producto" mode="edit" @productoActualizado="productoActualizado" />
  </div>
</template>

<script>
import api from '@/api.js';
import FormularioProducto from '@/components/FormularioProducto.vue';

export default {
  name: 'EditarProducto',
  components: {
    FormularioProducto
  },
  data() {
    return {
      producto: null
    };
  },
  created() {
    api.get(`/productos/${this.$route.params.id}`)
        .then(response => {
          this.producto = response.data;
        })
        .catch(error => {
          console.error('Error cargando producto:', error);
        });
  },
  methods: {
    productoActualizado() {
      this.$router.push('/lista-productos'); // Suponiendo que tienes una vista que muestra la lista de productos
    }
  }
}
</script>
