INSERT INTO
    Application_User (
        id,
        email,
        password)
VALUES (
    '1',
    'sylvain.cloutier@ezoqc.com',
    '$2y$12$IWwOJsk74LAkB.d5w/o4QuSrK0ldSWsN.Y68BkBkh3sR0XcC.MnOC');
    
INSERT INTO
    Application_User (
        id,
        email,
        password)
VALUES (
    '2',
    'test',
    'test');
    
INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '1',
    'Faire les courses',
    'true');
    
INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '2',
    'Jouer au soccer',
    'false');
    
INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '3',
    'Laver la voiture',
    'false');
    
INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '4',
    'Faire du sport',
    'false');
    
INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '5',
    'Lire un livre',
    'true');

INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '6',
    'Prendre une douche',
    'false');

INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '7',
    'Gonfler les pneus',
    'true');

INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '8',
    'Faire de l''essence',
    'true');

INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '9',
    'Aller au cinéma',
    'true');

INSERT INTO
    Todo (
        id,
        description,
        done)
VALUES (
    '10',
    'Commander un gateau d''anniversaire',
    'true');


INSERT INTO
    History (
        id,
        id_Todo,
	todo_Description,
        status,
	date)
VALUES (
    '1',
    '3',
    'Laver la voiture',
    'Created',
    '2022-11-08 14:10');
    
INSERT INTO
    History (
        id,
        id_Todo,
	todo_Description,
        status,
	date)
VALUES (
    '2',
    '1',
    'Faire les courses',
    'Modified',
    '2022-11-08 14:15');
    
INSERT INTO
    History (
        id,
        id_Todo,
	todo_Description,
        status,
	date)
VALUES (
    '3',
    '5',
    'Lire un livre',
    'Deleted',
    '2022-11-08 14:20');