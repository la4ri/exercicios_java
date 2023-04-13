Considere a seguinte linha de dados bancários de um arquivo de retorno de pagamento de boleto bancário:
10423547000003587253007202202082022 Sendo que se tem na sequência, as seguintes informações:
Banco(3 casas)
moeda (1 casa)
ag bancaria (5 digitos)
valor do boleto (10 casas, sendo as duas últimas representam os centavos)
data de vencimento (8 dígitos)
data de pagamento (8 dígitos)
A moeda deve ser verificada, sendo: 1=real, 2=dólar, 3=euro, 4=peso, 5=libra
Faça um programa que separe os respectivos conteúdos e escreva-os, sendo que o valor e as datas devem ser preparados para serem escritos no formato correto.
Exemplo de saída com dados fictícios:
Banco ............... 355
Moeda .............. Real
Agencia .......... : 35.470
Valor do boleto: 25.890,24
Dt.Vencimento: 25/10/2022
Dt.Pagamento ... 08/11/2022