<template>
  <div id="app">
    <div id="nav">
      <!-- <router-link :to="{ name: 'Login' }">Login</router-link> -->
    </div>
    <!-- <router-view @login="isLogin = true" /> -->
    <router-view />
  </div>
</template>

<script>
export default {
  name: "App",
  data: function() {
    return {
      isLogin: false
    };
  },
  methods: {},
  created: function() {
    // 로컬스토리지에 jwt 이 존재하는지에 따라 로그인 여부 판단하기
    // const token = localStorage.getItem("jwt");
    // if (token) {
    //   this.isLogin = true;
    // }
  }
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
