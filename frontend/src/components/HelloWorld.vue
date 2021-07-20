<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <button class="search_button" @click="callRestService()">
      CALL Spring Boot REST backend service
    </button>

    <h3>Response:</h3>
    <p>{{ response }}</p>

    <h3>Errors:</h3>
    <p>{{ errors }}</p>

  </div>
</template>

<script>
import { AXIOS } from '../utils/http-common';

export default {
  name: 'HelloWorld',
  props: {
    msg: String,
  },
  data() {
    return {
      response: [],
      errors: [],
    };
  },
  methods: {
    callRestService() {
      AXIOS.get('hello').then((response) => {
        console.log(123123123);
        console.log(response);
        this.response = response.data;
      }).catch((e) => {
        this.errors.push(e);
      });
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
