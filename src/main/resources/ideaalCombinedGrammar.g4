/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar ideaalCombinedGrammar;

// Mit 'testFile' können wir commands und queries in eine Datei schreiben.
testFile : commandFile queryFile EOF;

/* COMMANDS ------------------------------------------------- */

commandFile : (command NEWLINE?)* ;

/* Command ist die komplette Struktur eines Befehls. */
command: (subcommand (UND subcommand)? verb) | imperativeCommand ;

/* Ein Subcommand ist der Teil eines Befehls, der ohne Verb in Verbindung mit
 * 'und' mit weiteren Subcommands verbunden werden kann.
 */
subcommand: (aktor place? (value? | verb)?) ;

imperativeCommand : (imperative aktor place?) | (valuedImperative aktor place? imperativeValue) ;

aktor: (('das')? 'Licht') | (('die' | 'alle') 'Lichter') | 
       (('die' | 'alle') 'Lampen') | (('die')? 'Musik') | 
       (('die' | 'alle') 'Rollaeden') | (('den') 'Rolladen') |
       (('das' | 'die' | 'alle')? 'Fenster') ;
         
place: ('im' ('Wohnzimmer' | 'Schlafzimmer' | 'Bad' | 'Badezimmer')) | 'in der Küche' | 'irgendwo' ;

value: (('auf' | 'um') INT 'Prozent') ;

valuedVerb: value 'senken' | 'erhöhen' | 'stellen' ;

verb: 'an' | 'ein' | 'aus' | 'einschalten' | 'ausschalten' | 'runterfahren' | 'leiser' | 'lauter' ;

imperative : 'Schliesse' ;
valuedImperative: 'Schalte' | 'Stelle' | 'Senke' | 'Fahre' ;

imperativeValue: value | 'an' | 'aus' | 'runter';


/* QUERIES ------------------------------------------------- */

queryFile   : (query NEWLINE?)* ;

/* Query ist die komplette Struktur einer Abfrage. */
query: (questionWord ('noch')? aktor (place)? ('noch')? queryValue)
       | (questionWord place ('noch')? aktor ('noch')? queryValue) ;

questionWord : 'Ist' | 'Sind' ;

queryValue : 'an' | 'hoch' | 'oben' | 'zu' | 'auf' ;


/* TOKEN ------------------------------------------------- */

UND :   'und' ;
ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;