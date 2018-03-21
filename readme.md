# Final RPG (RPG Terminal)
Um RPG no terminal, onde voce sera um heroi em uma terra de fantasia cheia de aventuras e misterios.

Como personagem voce podera viajar para diversas regioes do barao **Anydo** e batalhar com um numero grande de criaturas e inimigos que buscam destruir a paz do mundo.

Seu heroi tera um acervo de habilidades e leveis, e o desempenho dele em batalha dependera de seus atributos.

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

Na janela principal do sistema o usuario podera escolher entre opcoes como, por exemplo:

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



 

	



