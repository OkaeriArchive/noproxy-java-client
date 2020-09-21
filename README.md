# OK! No.Proxy Java Client
Implementacja publicznego API OK! No.Proxy w Javie.

## Przykładowe użycie
```java
// dane uwierzytelniające
String token = "TWOJ-TOKEN";

// tworzymy context (w większości przypadków należy go gdzieś zapisać)
NoProxyApiContext apiContext = new NoProxyApiContext(token);
```

## Pobieranie przewidywań
```java
// zapytanie
String ip = "1.1.1.1";
AddressInfo addressInfo;
try {
    addressInfo = AddressInfo.get(apiContext, ip);
} catch (ApiException exception) {
    // TODO: obsluga bledu
    exception.printStackTrace();
    return;
}

System.out.println(addressInfo);
// podstawowe:
// czy adres ip jest proxy?
boolean swear = addressInfo.getRisks().isProvider();
// smart:
// czy adres jest podejrzany?
boolean verify = addressInfo.getSuggestions().isVerify();
// czy adres jest bardzo podejrzany?
boolean block = addressInfo.getSuggestions().isBlock();
```

## Dokumentacja

https://noproxy-api.okaeri.eu/swagger-ui/