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
        done,
        target_Date)
VALUES (
    '1',
    'Faire les courses',
    'true',
    '2022-01-01');
    
INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '2',
    'Jouer au soccer',
    'false',
    '2022-01-02');
    
INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '3',
    'Laver la voiture',
    'false',
    '2021-01-01');
    
INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '4',
    'Faire du sport',
    'false',
    '2022-02-01');
    
INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '5',
    'Lire un livre',
    'true',
    '2022-03-26');

INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '6',
    'Prendre une douche',
    'false',
    '2022-01-15');

INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '7',
    'Gonfler les pneus',
    'true',
    '2022-08-01');

INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '8',
    'Faire de l''essence',
    'true',
    '2022-01-01');

INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '9',
    'Aller au cinéma',
    'true',
    '2022-07-13');

INSERT INTO
    Todo (
        id,
        description,
        done,
        target_Date)
VALUES (
    '10',
    'Commander un gateau d''anniversaire',
    'true',
    '2022-02-28');


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