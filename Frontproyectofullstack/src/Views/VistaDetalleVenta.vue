<template>
  <div>
    <!-- Estructura HTML para mostrar el detalle completo de una venta, incluyendo el componente DetalleVenta -->
    <DetalleVenta :venta="ventaActual" />
  </div>
</template>

<script>
import DetalleVenta from '@/components/DetalleVenta.vue';

export default {
  name: 'VistaDetalleVenta',
  components: {
    DetalleVenta
  },
  data() {
    return {
      ventaActual: {}  // Aquí cargarías la venta actual, posiblemente desde una llamada API basada en un ID de venta
    };
  },
  methods: {
    // Métodos para cargar y manejar la información de la venta
  }
}
</script>

<style scoped>
/* Estilos de la vista VistaDetalleVenta */
</style>