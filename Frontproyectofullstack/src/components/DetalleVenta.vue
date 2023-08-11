<template>
  <div class="detalle-venta">
    <h3>Detalle de Venta</h3>
    <table>
      <thead>
      <tr>
        <th>Producto</th>
        <th>Cantidad</th>
        <th>Precio</th>
        <th>Subtotal</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="item in detalles" :key="item.id_producto">
        <td>{{ item.producto.nombre }}</td>
        <td>{{ item.cantidad }}</td>
        <td>{{ item.producto.precio }}</td>
        <td>{{ item.cantidad * item.producto.precio }}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'DetalleVenta',
  props: {
    detalles: Array // Esto representará la lista de productos y cantidades para una venta específica
  }
}
</script>

<style scoped>
/* Aquí puedes agregar estilos para hacer que la tabla y otros elementos se vean mejor */
</style>