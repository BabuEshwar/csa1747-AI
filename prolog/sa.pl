on_box(monkey, room).
on_box(monkey, box).
at(monkey, floor).
at(bananas, ceiling).
at(box, ceiling).
can_reach(Monkey, Bananas) :-
    on_box(Monkey, X),
    at(X, ceiling),
    at(Bananas, ceiling).




