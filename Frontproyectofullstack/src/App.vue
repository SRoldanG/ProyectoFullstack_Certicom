<script setup>
//import HelloWorld from './components/HelloWorld.vue'
//import TheWelcome from './components/TheWelcome.vue'
import Home from './views/Home.vue'
</script>

<template>
  <header>
<!--    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />-->
    <img alt="Vue logo" class="logo" src="https://www.certicom.com.pe/images/Certicom_logo.png" width="" height="" />
    <template>
      <nav>
        <router-link to="/">Inicio</router-link>
        <router-link to="/registro-cliente">Registrar Cliente</router-link>
        <router-link to="/registro-producto">Registrar Producto</router-link>
        <router-link to="/lista-clientes">Lista de Clientes</router-link>
        <!-- Agrega otros enlaces según necesites -->
      </nav>
    </template>
    <div class="wrapper">
<!--      <HelloWorld msg="You did it!" />-->
    </div>
  </header>

  <main>
<!--    <TheWelcome />-->
    <router-view></router-view> <!-- Aquí es donde se renderizarán las vistas -->
  </main>
</template>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;

  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
