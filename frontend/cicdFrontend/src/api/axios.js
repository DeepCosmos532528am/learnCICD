import axios from 'axios'

const api = axios.create({
    baseURL : 'http://localhost:8080' //here in production this localhost refers to the server local, means the ec2
})

export default api

