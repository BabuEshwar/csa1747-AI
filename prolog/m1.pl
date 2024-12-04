planet(mercury,sun).
planet(venus,sun).
planet(earth,sun).
planet(moon,earth).
planet(phobos,mars).
planet(deimos,sun).
suns(mercury).
suns(venus).
suns(earth).
earths(moon).
mars(phobos).
mars(deimous).
all_suns(Sun):-
    suns(Sun).
all_earths(Earth):-
    earths(Earth).
all_mars(Mars):-
    mars(Mars).
all_planets(Planet,Sun):-
    planet(Planet,Sun).




