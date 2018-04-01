<template>
  <router-link :to="{ path: 'login'}">
    <el-button type="primary">登入</el-button>
  </router-link>
</template>
<script>
  export default {
    data() {
      return {
        msg: 'Welcome'
      }
    }
  }
</script>
<style>

</style>
