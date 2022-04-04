class Pessoa {
      constructor (pNome,pCpf,pCnpj,pRazao,pEndereço,pBairro,pCep,pCidade,pEstado,pNascimento){
            this.Nome=pNome;
            this.Cpf=pCpf;
            this.Cnpj=pCnpj;
            this.Razao=pRazao;
            this.Endereço=pEndereço;
            this.Bairro=pBairro;
            this.Cep=pCep;
            this.Cidade=pCidade;
            this.Estado=pEstado;
            this.Nacimento=pNascimento;

      }
      get Nome (){
                  return this,Nome;
      }

      set Nome (pNome) {
        this .Nome = pNome;
      }
      set Cpf (pCpf) {
        this .Cpf=pCpf;
      }
      set Cnpj (pCnpj) {
        this .Cnpj=pCnpj;
      }
      set Razao(pRazao){
        this . Razao=pRazao;              
      }
      set Endereço (pEndereço){
          this .Endereço=pEndereço;
      }
      set Bairro (pBairro){
          this .Bairro=pBairro;       
      }
      set Cep (pCep){
          this .Cep=pCep;
      }
      set Cidade (pCidade){
          this .Cidade=pCidade;
      }
      set Estado (pEstado){
          this .Estado=pEstado;
      }
      set Nascimento (pNascimento){
          this .Nascimento=pNascimento;
      }
    
     }