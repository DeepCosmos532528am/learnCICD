import './App.css'
import api from "./api/axios.js";
import {useState} from "react";



function App() {

    const [greets, setGreets] = useState("noGreet");

    const greet = async (greet) => {
        const response = await api.get('/greet?name=Sachin')
        setGreets(response.data)
    }
    return <>
        <button onClick={greet} style={{
            backgroundColor: 'red',
            border: "none",
            height: "fit-content",
            width: "fit-content",
            fontSize: '20px',
           padding: '10px 20px',
        }}>
            ClickkMe
        </button>

        <h1>{greets}</h1>
</>
}

export default App
