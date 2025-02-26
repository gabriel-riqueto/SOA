// import bibli

const express = require('express'); // Aciona bibli express (Comunicação server)

const axios = require('axios') // Aciona bibli axios (Comunicação HTTPS)


const app = express(); //Define/Ativa o servidor

const PORT = 3000; // Define a porta do server

//Endpoint para buscar o endereço pelo CEP

app.get('/cep/:cep', async (req, res) =>{

    const { cep } = req.params;

    try{

        // Requisição API ViaCep
        const response = await axios.get(`https://viacep.com.br/ws/${cep}/json/`);

        const endereco = response.data;


        //Se o CEP não for encontrado

        if (endereco.erro){
            
            return res.status(404).json({ mensagem: 'CEP não encontrado'});
        
        }

        // Retorna o endereço formatado

        res.json({

            cep: endereco.cep,

            logradouro: endereco.logradouro,

            bairro: endereco.bairro,

            cidade: endereco.localidade,

            estado: endereco.uf

        });

    } catch (erro) {

        res.status(500).json({ mensagem: 'Erro ao consultar o CEP'});
    }

});


// Iniciando o server

app.listen(PORT, () => {

    console.log(`Servidor rrodando em http://localhost:${PORT}`);

});
