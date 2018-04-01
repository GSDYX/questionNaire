<template>
  <h1>{{ msg }}</h1>
</template>
<script>
  export default {
    name: 'HelloWorld',
    data () {
      return {
        msg: 'Welcome'
      }
    }
  }
</script>
<style>
  h1 {
    font-weight: normal;
  }
  a {
    color: #42b983;
  }
</style>
