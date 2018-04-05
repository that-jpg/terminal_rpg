# Final RPG (RPG Terminal)
Um RPG no terminal, onde você será um herói em uma terra de fantasia cheia de aventuras e mistérios.
Como personagem, você poderá viajar para diversas regioes do barao **Odlareg** e batalhar com um numero grande de criaturas e inimigos que buscam destruir a paz do mundo.

Seu heroi tera um acervo de habilidades e leveis, e o desempenho dele em batalha dependerá de seus atributos.

 - Heroi
	- nome
	- descricao
	- xp
	- dinheiro
	- items
		- efeito
		- nome 
		- descricao
	- habilidades
		- nome
		- descricao
		- efeito
		- dano
	- atributos
		- forca
		- vida
		- carisma
		- sorte
	- level
		- um inteiro que ira de 1 -> Infinito e que a cada adicao disponilizara mais pontos para serem distribuidos como atributos

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
Salvar o estado do jogo, para o usuario poder voltar depois
Novos itens como armaduras ou armas
Novas classes de heroi com habilidades diferentes
Um modo historia.

## Objetos a serem implementados
 * Engine
	// Objeto que implementara a logica de negocio do jogo.
	// O CLI do nosso jogo, onde o usuario vai poder interagir
	* hero [Hero]
	* regions [Regions[]]
	* current_region [Region]
	* state [Enum "Menu/Battle"]
 * Hero
	- name [String]
	- description [String]
	- items [Item[]]
	- skills [Skill[]]
	- level [Int]
	- experience [Int]
	- money [Int] // sao moedas de ouro
 * Item
	- effect [String]
	- name [String]
	- description [String]
 * Skill
	- effect [String]
	- name [String]
	- description [String]
	- basic_damage [Int]
 * Attributes
	- strength [Int]
	- health [Int]
	- carisma [Int]
	- luck [Int]
 * Potions
	- effect [String]
	- name [String]
	- description [String]
 * Enemy
	- name [String]
	- description [String]
	- loot [Item[]]
	- skills [Skill[]]
	- experience [Int]
 * Region
	- name [String]
	- description [String]
	- min_level [Int]

## Classes do Projeto e funcionamento (Atualizado dia 05/04/2018)

	Classe Persona:
		Classe mais genérica que indica qualquer personagem, do jogo, seja Herói ou inimigo.
		Possui os atributos mais gerais, são eles:
		name - string com o nome do personagem.
		description - string com uma descrição da história do personagem e algum detalhe relevante.
		attributes - lista com os atributos do personagem, que indicarão o desempenho e as características do personagem em batalha.
		skills - lista com as skills do personagem, indicarão os tipos de ataques dos personagens em batalha.
		experience - indica a experiencia do personagem, ou seja, a quantidade de pontos adquiridos pelo personagem, tal pontuação
		é usada para obter o level dos personagens.
	Funcionamento: 
		Somente os getter's e setter's para manipulção dos atributos.


	Classe Hero:
		Será o personagem do(s) jogador(es) no RPG,  todo heroi também é uma pessoa, por isso existe uma relação de herança com a classe persona,
		com os seguintes atributos especificos:
		items - Lista com os itens do que o herói possui.
		level - inteiro que armazena o nível do personagem.
		money - inteiro que armazena a quantidade de dinheiro do personagem.
	Funcionamento: 
		Basicamente usaremos somente getter's e os setter's para manipulação dos atributos, 
		por enquanto, sem nenhuma função adicional.

	Classe Attribute:
		Classe que contém o os atributos de personagem, tais atributos alteram o desempenho de personagem durante a batalha
		e também alguns pontos do gameplay.
		Até agora os atributos definidos são:
		- Strenght - Força do personagem, atributo usado em batalhas para definir o dano inflingido pelo personagem em ataque especificos
		(que serão definidos)
		- Health - Vida do personagem, indica o quanto de dano o personagem pode receber.
		- Carisma - Carisma do Personagem, indica a habilidade de persuasão  em dialogos além de aumentar as chances de fuga em batalha.
		- Luck - Sorte, basicamente indica a chance de loot de alguns itens após a morte de personagens.
	
	Funcionamento: 
		Basicamente usaremos somente getter's e os setter's para manipulação dos atributos, 
		por enquanto, sem nenhuma função adicional.

	
	Classe Skill:
		Indica as habilidades especiais do personagem, tais habilidades são usadas para inflingir dano durante as batalhas.
		possui os seguintes atributos:
		effect - String que indica o efeito da habilidade em batalha.
		name - String com o nome da habilidade em batalha.
		description - String com uma descrição user-friendly para o jogador.
		basicDamage - inteiro que será usado como parâmetro para o calculo do dano da habilidade.
	Funcionamento: 
		Basicamente usaremos somente getter's e os setter's para manipulação dos atributos, 
		por enquanto, sem nenhuma função adicional.



