
import Vue from "vue"
import Router from "vue-router"
import Home from "../views/Home.vue"
import Room from "../views/Room.vue"
import RoomList from "../views/RoomList.vue"

// import Login from "../components/Login.vue"
// import SignUp from "../components/SignUp.vue"

Vue.use(Router)

export default new Router({
  mode: "history",
  routes: [
    {
      path: "/",
      name: "Home",
      component: Home
    },
    {
      path: "/room",
      name: "Room",
      component : Room
    },
    {
      path: "/rooms",
      name: "Roomlist",
      component : RoomList
    }
    
  ],
})