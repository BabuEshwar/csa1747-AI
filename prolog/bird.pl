bird(penguin).
bird(sparrow).
bird(ostrich).
bird(parrot).
bird(eagle).
can(sparrow).
can(eagle).
can(parrot).
bird_can(Bird):-
    bird(Bird),
    can(Bird).
bird_cannot(Bird):-
    bird(Bird),
    \+ can(Bird).
