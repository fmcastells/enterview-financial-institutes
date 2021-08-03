payload =
{  
    "country" : "Canada",
    "institution" : "Banque Nationale du Canada",
    "chargebackValue" : 200.00,
    "shouldNotify" : false
}


La demande:

1) tu dois notifier le client si le pays commence par CAN
2) tu dois notifier le client si le montant demandé depasse 100.00
3) tu dois normaliser l'instituition pour prendre seulement les 3 premieres majuscule