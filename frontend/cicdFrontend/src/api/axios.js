import axios from 'axios'

const api = axios.create({
    baseURL : 'http://13.201.222.247:8080' //here in production this localhost refers to the server local, means the ec2
})

export default api

