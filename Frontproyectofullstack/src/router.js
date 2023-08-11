//import * as Vue from 'vue'
//import * as Vue from 'vue-router';
import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/views/Home.vue';
import Venta from '@/views/Venta.vue';
import VentasPorFecha from '@/views/VentasPorFecha.vue';
import RegistroCliente from '@/views/RegistroCliente.vue';
import RegistroProducto from '@/views/RegistroProducto.vue';
import ListaClientes from '@/views/ListaClientes.vue';
import ListaProductos from '@/views/ListaProductos.vue';
import EditarCliente from '@/views/EditarCliente.vue';
import EditarProducto from '@/views/EditarProducto.vue';
import DetalleVenta  from "@/components/DetalleVenta.vue";



const routes = [
    {
        path: '/',
        name: 'home',
        component: Home
    },

    {
        path: '/venta/:id',
        name: 'venta',
        component: Venta
    },
    {
        path: '/ventas-por-fecha',
        name: 'ventasPorFecha',
        component: VentasPorFecha
    },

    {
        path: '/registro-cliente',
        name: 'registroCliente',
        component: RegistroCliente
    },
    {
        path: '/registro-producto',
        name: 'registroProducto',
        component: RegistroProducto
    },
    {
        path: '/lista-clientes',
        name: 'listaClientes',
        component: ListaClientes
    },
    {
        path: '/lista-productos',
        name: 'listaProductos',
        component: ListaProductos
    },
    {
        path: '/editar-cliente/:id',
        name: 'editarCliente',
        component: EditarCliente
    },
    {
        path: '/editar-producto/:id',
        name: 'editarProducto',
        component: EditarProducto
    },
    {
        path: '/detalle-venta/:id',
        name: 'detalleVenta',
        component: DetalleVenta
    }
    // ... tus otras rutas ...
];

const router = createRouter({
    history: createWebHistory(),
    routes
});
export default router;