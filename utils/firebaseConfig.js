// Importar as funções necessárias do SDK Firebase
import { initializeApp } from 'firebase/app';

// Sua configuração do Firebase
const firebaseConfig = {
    apiKey: "AIzaSyAil26Eg-hTBcByPDSlYFYTF5RZAnmqpM0",
    authDomain: "testelabbackend.firebaseapp.com",
    projectId: "testelabbackend",
    storageBucket: "testelabbackend.appspot.com",
    messagingSenderId: "103650966149",
    appId: "1:103650966149:web:2992653d12518b62be47ec"
  };

// Inicializar o Firebase
const app = initializeApp(firebaseConfig);

export default app;
