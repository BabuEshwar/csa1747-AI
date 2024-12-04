mammal(dog).
mammal(cat).
bird(sparrow).
fish(shark).

% Rules
is_animal(X) :- mammal(X).
is_animal(X) :- bird(X).
is_animal(X) :- fish(X).
