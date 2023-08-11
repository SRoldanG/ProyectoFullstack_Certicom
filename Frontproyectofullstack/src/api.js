import axios from 'axios';

const instance = axios.create({
    baseURL: 'http://localhost:8080', // Ajusta esto según la URL de tu backend
});

export default instance;