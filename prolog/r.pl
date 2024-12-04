
parent(john, mary).
parent(john, mike).
parent(mary, alice).
parent(mary, bob).
parent(mike, charlie).
parent(mike, diana).

father(X,Y):-
parent(X,Y).

grand(X,Y):-
parent(X,Z),
parent(Z,Y).