symptoms(flu,[fever,cough,sore_throat]).
symptoms(cold,[cough,sneezing,runny_nose]).
symptoms(covid,[fever,cough,sore_throat,shortness_of_breath]).
diagnosis(Disease,Givensymptoms):-
    symptoms(Disease,Givensymptoms).
