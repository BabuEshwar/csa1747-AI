diet(diabetes,'low sugar diet').
diet(diabetes,'high fiber diet').
diet(hyperttension,'low sodium diet').
diet(hypertension ,'low fat diet').
diet(celiac,'gluten-free diet').
diet(celiac,'high protein diet').
diet(anemia,'iron-rich diet').
diet(anemia,'vitaminc rich diet').
suggest_diet(Disease,Diet):-
    diet(Disease,Diet).

