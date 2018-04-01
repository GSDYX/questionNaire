<template>
  <el-row class="tac">
    <el-col :span="8">
      <h1>登陆页面</h1>
      <el-form :model="ruleForm" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="账号" prop="name">
          <el-input type="text" v-model="ruleForm.name" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="pass">
          <el-input type="password" v-model="ruleForm.pass" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm('ruleForm')">登陆</el-button>
          <router-link :to="{ path: 'registration'}">
            <el-button type="text">注册</el-button>
          </router-link>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
</template>

<script>
  export default {
    data() {
      return {
        url: '/user/getByNameAndPass.action',
        ruleForm: {
          name: '',
          pass: ''
        }
      }
    },
    methods: {
      //  提交按钮事件
      submitForm(formName) {
        axios.post('/user', ruleForm)
          .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });


      }

    }

  }
</script>

<style>

</style>
