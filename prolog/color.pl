fruit(apple, red).
fruit(banana, yellow).
fruit(grape, purple).
foc(Color, Fruit) :-
    fruit(Fruit,Color).
