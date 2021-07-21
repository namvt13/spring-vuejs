/* eslint-disable import/prefer-default-export */
import axios from 'axios';

export const AXIOS = axios.create({
  baseURL: 'http://localhost:8098/api',
  headers: {
    // Unecessary
    'Access-Control-Allow-Origin': 'http://localhost:8080',
  },
});
