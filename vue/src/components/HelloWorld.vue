<template>
  <div>
  <h1>{{ msg }}</h1>
    <h2>成功</h2>
  <!--<ul>-->
    <!--<li v-for="ok in oks.list">-->
      <!--{{ok.username}}-->
    <!--</li>-->
  <!--</ul>-->
  </div>
</template>
<script>
  import axios from 'axios';
  export default { //ES6语法，用于输出到外部，这样就可以在其他文件内用import输入
    name: 'HelloWorld',
    data () {    //由于是组件，data必须是个函数，这是ES6写法，data后面加括号相当于data: function () {}
      return {   //记得return不然接收不到数据
        msg: 'Welcome' //上面的 msg 就是这里输出的
      }
    }
    // ,
    // created(){
    //   axios.get('http://localhost:8081/manager/test')
    //     .then(response=>{
    //       console.log(response);
    //       this.oks=response.data;
    //     })
    //     .catch(error=>{
    //       console.log(error);
    //       alert('网络错误，不能访问');
    //     })
    // }
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
