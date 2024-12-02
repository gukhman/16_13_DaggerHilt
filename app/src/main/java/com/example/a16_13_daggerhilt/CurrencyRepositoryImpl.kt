package com.example.a16_13_daggerhilt

class CurrencyRepositoryImpl : CurrencyRepository {
    override fun getCurrencies(): List<Currency> {
        return listOf(
            Currency("Российский Рубль", "https://upload.wikimedia.org/wikipedia/commons/0/04/Banknote_500000_rubles_%281995%29_back.jpg"),
            Currency("Канадский доллар", "https://www.ceae.ru/files/1(226).jpg"),
            Currency("Гонконгский доллар", "https://upload.wikimedia.org/wikipedia/ru/7/77/HKD_HSBC_2018.jpg"),
            Currency("US Dollar", "https://upload.wikimedia.org/wikipedia/commons/d/df/US_%241_obverse.jpg"),
            Currency("Доллар фиджи", "https://www.calc.ru/imgs/articles/168-14976ec5534e2773c4fb0d3edb44dfc9.jpg"),
            Currency("Euro", "https://ru.numista.com/catalogue/photos/zone_euro/63a58261b23d24.74036708-original.jpg"),
            Currency("Китайский Юань", "https://coinsandnotes.ru/wa-data/public/shop/products/08/08/808/images/522/522.200@2x.jpg"),
            Currency("Турецкая Лира", "https://lh3.googleusercontent.com/proxy/phYCToNINKhO0SrpcFwnZeciJx1pAmJZidRPx32Bzj8hyodYasMXh9KW4OSlh4i4DxhMx0uzSqQyWyIUyMMYuM4y1u1zye9RqZlIx_vuonpukw"),
            Currency("Japanese Yen", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/5000_Yenes_%282004%29_%28Anverso%29.jpg/1200px-5000_Yenes_%282004%29_%28Anverso%29.jpg")
        )
    }
}