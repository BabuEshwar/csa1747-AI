on_box(monkey, room).
on_box(monkey, box).
at(monkey, floor).
at(bananas, ceiling).
can_reach(monkey, bananas) :-
    on_box(monkey, box),
    at(bananas, ceiling).
