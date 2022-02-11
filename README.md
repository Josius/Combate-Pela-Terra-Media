# Combate-Pela-Terra-Media
Emulação de combate entre alguns heróis do Senhor dos Anéis contra Sauron. 
O intuíto dessa simulação é para treinar e verificar o padrão de projeto Strategy e Singleton.

### Funcionamento:
- Há a classe mãe Personagem e as classes filhas que representam os heróis/vilões do Senhor dos Anéis, tais como Aragorn, Legolas, Saruman, Sauron, etc. Não é limitado somente a esses, podendo criar outros personagens icônicos ou genéricos.
- As classes filhas utilizam o padrão de projeto Strategy para instanciar seus variados tipos de ações.
- Dentre os tipos de ações estão:
  - Ataque Simples e Conjurar, todavia serão acrescidos mais algumas ações, como Ataque Duplo, Triplo, Andar, Conversar e qualquer outra Classe que possa ser coberta pelo entendimento de ação.
- Há também classes mãe Arma e Magia, e suas respectivas filhas, cada uma com um respectivo comportamento para execução:
  - **ARMA:** Arco Curto, Arco Longo, Espada Curta, Espada Longa.
  - **MAGIA:** Bola de Fogo e Curar.
- **Classe Batalha:** gerencia o combate, com métodos para evitar que um herói ataque outro herói (assim como ele mesmo XD);
- **Classe Dados:** uma classe que usa o padrão de projeto Singleton para simular a rolagem de dados utilizados em muitos RPGs de mesa, tais como d2, d4, d6, d8, d10, d12, d20.
- Para acertar um personagem com um ataque é rolado um d20 mais um bônus de ataque do personagem, em seguida, é comparado esse resultado com a classe de armadura do personagem alvo, se for igual ou maior ocorre um acerto e o personagem atacante efetua dano ao alvo, este dano depende de qual arma o atacante está utilizando, sendo que cada arma possuí um valor de dano que é gerado aleatóriamente na rolagem dos dados. Por exemplo, uma espada curta causa 1d6 de dano, logo 1d6 é rolado e seu resultado é abatido dos pontos de vida do personagem alvo.
