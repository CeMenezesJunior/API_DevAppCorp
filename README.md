# API_DevAppCorp
Essa API não precisa de autenticação, ela possui as propriedades GET e POST

### Volume

O Volume representa toda o volume dos artigos feitos pelo autor

| Atributo   |      Descrição      |
|----------|:-------------:|
| id       |  Gerador único de dados |
| sigla    |  Sigla com a língua original do volume   |
| dataInicio | Data de publicação do volume |
| descricaoPT | Descrição Do volume em português |
| descricaoEN | Descrição Do volume em inglês |

#### Acesso a lista
    /volume

##### Get
Exemplo de retorno

    GET /volume

```json
   [
        {
            "id": 1,
            "sigla": "RM",
            "dataInicio": "2021-08-11",
            "numEvento": 22,
            "descricaoEN": "tfgmrpgmptgkmtpest",
            "descricaoPT": "dkdsfkmfpsfm"
        }
    ]
```

##### Post
Exemplo de inclusão

    POST /volume

```json
    {
        "sigla":"RM",
        "numEvento": 22,
        "dataInicio": "2021-08-12",
        "descricaoPT": "dkdsfkmfpsfm",
        "descricaoEN": "tfgmrpgmptgkmtpest"
    }
```

### Artigo

O Artigo representa o artigo escrito pelo autor

| Atributo   |      Descrição      |
|----------|:-------------:|
| id       |  Gerador único de dados |
| order    |  Ordem de autoria   |
| idioma    |  Sigla com a língua original do artigo   |
| TituloOr | O titulo na língua original |
| TituloIn | O titulo em inglês |
| KeyWordOr | Palavras chaves na língua original  |
| KeyWordIn | Palavras chaves em inglês  |
| numPag | Número de páginas do artigo |
| Volume | Volume ao qual o artigo pertence |

#### Acesso a lista
    /artigo

##### Get
Exemplo de retorno

    GET /artigo

```json
   [
        {
            "id": 2,
            "ordem": 0,
            "idioma": "PT",
            "tituloOr": "O caldeirão saltitante",
            "tituloIn": "Hopping Pot",
            "resumo": "Um caldeirão mágico que fica saltitando",
            "keyWordOr": "caldeirão",
            "keyWordIn": "magic",
            "volume": {
                "id": 1,
                "sigla": "RM",
                "dataInicio": "2021-08-11",
                "numEvento": 22,
                "descricaoEN": "tfgmrpgmptgkmtpest",
                "descricaoPT": "dkdsfkmfpsfm"
            },
            "numPag": 3
        }
    ]
```

##### Post
Exemplo de inclusão

    POST /artigo

```json
    {
        "order": 1,
        "idioma":"PT",
        "tituloOr":"O caldeirão saltitante",
        "tituloIn": "Hopping Pot",
        "resumo": "Um caldeirão mágico que fica saltitando",
        "keyWordOr": "caldeirão",
        "keyWordIn": "magic",
        "numPag": 3,
        "volume": 
                {
                    "id": "1",
                "sigla":"RM",
                    "numEvento": 22,
                    "dataInicio": "2021-08-12",
                    "descricaoPT": "dkdsfkmfpsfm",
                    "descricaoEN": "tfgmrpgmptgkmtpest"
                }
    }
```

### Autor

O Autor representa o autor que escreveu o artigo

| Atributo   |      Descrição      |
|----------|:-------------:|
| id       |  Gerador único de dados |
| ordem    |  Ordem de autoria   |
| firstName | Primeiro nome |
| middleName | Nome do meio |
| lastName | Último nome |
| afiliacaoOr | Afiliação na lÍngua original  |
| afiliacaoIn | Afiliação em inglês  |
| pais | Pais de origem do autor  |
| orcIn | Em inglês |
| Artigo | Artigo escrito pelo autor |

#### Acesso a lista
    /autor

##### Get
Exemplo de retorno

    GET /autor

```json
   [
    {
        "id": 7,
        "ordem": 1,
        "email": null,
        "firstName": "Carlos",
        "middleName": "Eduardo",
        "lastName": "Menezes",
        "afiliacaoOr": "iedweifdbiiwbfd",
        "afiliacaoIn": "iedweifdbiiw",
        "pais": "BR",
        "orcIn": "mwsdmo",
        "artigo": {
            "id": 6,
            "ordem": 0,
            "idioma": "PT",
            "tituloOr": "O caldeirão saltitante",
            "tituloIn": "Hopping Pot",
            "resumo": "Um caldeirão mágico que fica saltitando",
            "keyWordOr": "caldeirão",
            "keyWordIn": "magic",
            "volume": {
                "id": 4,
                "sigla": "RM",
                "dataInicio": "2021-08-11",
                "descricaoPT": "dkdsfkmfpsfm",
                "descricaoEN": "tfgmrpgmptgkmtpest",
                "numEvento": 22
            },
            "numPag": 3
        }
    }
]
```

##### Post
Exemplo de inclusão

    POST /autor

```json
   {
    "ordem":1,
    "firstName":"Carlos",
    "middleName":"Eduardo",
    "lastName":"Menezes",
    "afiliacaoOr":"iedweifdbiiwbfd",
    "afiliacaoIn":"iedweifdbiiw",
    "pais":"BR",
    "orcIn":"mwsdmo",
    "artigo":
        {
        "id": 6,
        "ordem": 0,
        "idioma": "PT",
        "tituloOr": "O caldeirão saltitante",
        "tituloIn": "Hopping Pot",
        "resumo": "Um caldeirão mágico que fica saltitando",
        "keyWordOr": "caldeirão",
        "keyWordIn": "magic",
        "volume": {
            "id": 4,
            "sigla": "RM",
            "dataInicio": "2021-08-12T00:00:00.000+00:00",
            "descricaoPT": "dkdsfkmfpsfm",
            "descricaoEN": "tfgmrpgmptgkmtpest",
            "numEvento": 22
        },
        "numPag": 3
    }
}
```