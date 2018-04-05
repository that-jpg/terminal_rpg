# Final RPG (RPG Terminal)
Um RPG no terminal, onde você será um herói em uma terra de fantasia cheia de aventuras e mistérios.
Como personagem, você poderá viajar para diversas regioes do barao **Odlareg** e batalhar com um numero grande de criaturas e inimigos que buscam destruir a paz do mundo.

Seu heroi tera um acervo de habilidades e leveis, e o desempenho dele em batalha dependerá de seus atributos.

Na janela principal do sistema o usuário poderá escolher entre opcoes como, por exemplo:

- Procurar batalha
	- ira encontrar um monstro que ao ser derrotado ira dar XP e items que podera ser usado pelo usuario.
- Viajar para outra regiao
	- Muda os monstros do qual o heroi podera enfrentar, aumentando/diminuindo a dificuldade e as recompensas de acordo.
- Treinar
	- Um treinamento onde o heroi podera ficar mais forte sem correr riscos.
- Lojinha
	- Uma lista de opcoes na qual o heroi pode comprar items em geral.

Cada uma dessas janelas tera novas opcoes para o usuario interagir,
- Procurar batalha
	- Usar Habilidade
		- Lista de habilidades 
	- Usar poTION
	- Fugir

- Viajar para outra regiao
	- Lista de regioes onde ele pode viajar com restricao de level
	- Existe um total de 5 regioes
- Inimigos
	- Existe um total de 5 inimigos por regiao
- Pocoes
	- Existem 4 pocoes
		- recupera pouca vida
		- recupera media vida
		- recupera muita vida
		- aumenta forca durante a batalha

## Features do futuro
- Salvar o estado do jogo, para o usuario poder voltar depois
- Novos itens como armaduras ou armas
- Novas classes de heroi com habilidades diferentes
- Um modo historia.

## Classes do Projeto e funcionamento (Atualizado dia 05/04/2018)
### Classe Engine:
Classe principal do sistema, ela que cordena todas as interações entre o jogador e relações entre os objetos do jogo, possui
caracteristicas de estado que server para organizar o fluxo do jogo (menus e ações do usuário) e como isso afeta o restante 
das classes. Essa classe possui os seguintes attributos:
- hero - Guarda o objeto que corresponde ao heroi da aventura.
- regions - Lista com todas as regiões que podem ser visitadas.
- currentRegion - Região onde o usuário está em dado momento.
- state - Informa em qual modo o usuario está (batalha/ataque/shop/attributos)
#### Funcionamento: 
Ela lidará com a inicialização dos attributos e a interface do usuário. Ela se comporta como comunicadora entre os objetos e os relaciona.
Ao iniciar o jogo o usuário terá as seguintes opções.
- *Começar*
- *Como Jogar?*
- *Sobre*
Cada um desses menus levará o usuario para uma lugar diferente dentro da aplicação.

##### Menus
###### Começar
Ao começar o jogo é requerido escrever o nome, uma breve descrição e os attributos iniciais do seu herói, depois dessa 'configuração inicial' o usuario 
vai ter acesso a uma árvore de menus que é o modo no qual se interage com o sistema.
Entre as opções que poderão ser escolhidas é possivel encontrar:
- Mapa: Menu que permite que o herói viage pelo reino, trocando de regiões.
- Procurar batalha: Menu que permite que o heroi enfrente seus inimigos, ao escolher essa opções um inimigo irá aparecer e o modo batalha será iniciado,
nesse modo batalha existem mais menus que orientam as acoes do usuario (atacar, usar item, tentar fugir);  
- Ir ao Shopping: Permite que o usuario visualize e interaja e compre items usando seus recursos.

##### Fluxo do jogo
Depois de passar por todas as regiões disponveis e sobreviver a incontaveis batalhar. 
O jogador poderá enfrentar o Boss final, caso vitorioso o jogo irá ser completado e o reino viverá em paz.

Caso o resultado da batalha seja negativo, isso é, o heroi for derrotado ele morrerá e todo o progresso será reiniciado.

###### Batalhs
O inimigo que será enfrentado depende da região em que o heroi se encontra e em variaveis aleatorias que podem resultador em inimigos 
mais fortes o mais fracos variando de acordo com a sorte. Em cada região um determinado numero fixo de inimigos precisam ser derrotados
antes que o o jogador possa enfrentar o _"chefe"_ dessa região, e o _"chefe"_ final só poderá ser enfretado caso vitoria seja obtida no
confronto com o chefe de todas as regiões.

###### Itens
Existem itens que possuem efeitos temporarios (que duram apenas durante uma batalha) e itens que possuem efeitos permanentes enquanto sendo usados.

####### Potions
São itens cujo efeito duram apenas uma batalha, podem influenciar nos atributos do heroi, como força ou pontos de vida.

####### Weapons
São itens que podem ser equipados, isso é, influenciam os cálculos de batalha enquanto estão sendo utilizados.

###### Sobre
Exibe informações que podem ajudar o usuário a utilizar a aplicação, uma area de perguntas e respostas em respeito a usabilidade.

###### Sobre
Mostra a motivação por trás do desenvolvimento (aprender e aplicar conceitos de programação orientadada a objetos), e também informações adicionais a equipe que desenvolveu o jogo. 

### Classe Enemy
Inimigos que nosso heroi irá enfrentar em sua jornada, cada inimigo possui as seguintes caracteristicas:
- loot - items que o heroi obterá ao derrotar o inimigo.
 
### Classe Persona:
Classe mais genérica que indica qualquer personagem, do jogo, seja Herói ou inimigo.
Possui os atributos mais gerais, são eles:
- name - string com o nome do personagem.
- description - string com uma descrição da história do personagem e algum detalhe relevante.
- attributes - lista com os atributos do personagem, que indicarão o desempenho e as características do personagem em batalha.
- skills - lista com as skills do personagem, indicarão os tipos de ataques dos personagens em batalha.
- experience - indica a experiencia do personagem, ou seja, a quantidade de pontos adquiridos pelo personagem, tal pontuação
é usada para obter o level dos personagens.

#### Funcionamento: 
Possui as ações que o personagem realiza, como atacar por exemplo.
- attack - Com base nos seus attributos e items ele cálcula uma quantidade chamada "damage" que é enviada para o adversário, esse pontos podem possivelmente diminuir
os pontos de vida do adversario.
- defend - Recebe uma quantidade pontos de "damage" e com base nos seus atributos calcula o quanto de vida a Persona ira perder ao receber aquele ataque.
- getters e setters para os atributos
 
### Classe Hero:
Será o personagem do(s) jogador(es) no RPG,  todo heroi também é uma pessoa, por isso existe uma relação de herança com a classe persona,
com os seguintes atributos especificos:
- items - Lista com os itens do que o herói possui.
- level - inteiro que armazena o nível do personagem.
- money - inteiro que armazena a quantidade de dinheiro do personagem.
#### Funcionamento: 
- useItem - Usa um item que está contido em sua lista de items
- getters e setters para os atributos

### Classe Attribute:
Classe que contém o os atributos de personagem, tais atributos alteram o desempenho de personagem durante a batalha e também alguns pontos do gameplay.
Até agora os atributos definidos são:
- Strenght - Força do personagem, atributo usado em batalhas para definir o dano inflingido pelo personagem em ataque especificos
(que serão definidos)
- Health - Vida do personagem, indica o quanto de dano o personagem pode receber.
- Carisma - Carisma do Personagem, indica a habilidade de persuasão  em dialogos além de aumentar as chances de fuga em batalha.
- Luck - Sorte, basicamente indica a chance de loot de alguns itens após a morte de personagens.
#### Funcionamento: 
- getDamage - com base nos atributos calcula quantidade de 'dano' que vai ser causado.
- getDefense - com base nos atributos calcula quantidade de 'defesa' (quantidade de dano que vai ser suportada).
- getters e setters

### Classe Skill:
Indica as habilidades especiais do personagem, tais habilidades são usadas para inflingir dano durante as batalhas.
possui os seguintes atributos:
- effect - String que indica o efeito da habilidade em batalha.
- name - String com o nome da habilidade em batalha.
- description - String com uma descrição user-friendly para o jogador.
- basicDamage - inteiro que será usado como parâmetro para o calculo do dano da habilidade.
#### Funcionamento:
- use - Usa uma habilidade, que dependendo da habilidade pode causar dano ou afetar outros atributos  
- getters e setters

### Region:
Representa a região em que o heroi se encontra, cada regiões possuem inimigos diferentes e afetam o jogo de maneira diferentes.
- name - String com o nome da região em que o usario se encontra.
- description - String com a descricão da região.
- minLevel - Level minimo que o heroi deve possuir antes de entrar nessa região.
- enemies - Lista de inimigos que podem ser encontrado nessa região.

 
