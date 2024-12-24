package com.example.nearby.ui.component.market_details


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.data.model.Market
import com.example.nearby.data.model.mock.mockMarkets
import com.example.nearby.ui.theme.Gray400
import com.example.nearby.ui.theme.Gray500
import com.example.nearby.ui.theme.Typography
import com.example.nearby.R

@Composable
fun NearbyMarketDetailsInfos(modifier: Modifier = Modifier, market: Market) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Informacoes",
            style = Typography.headlineSmall,
            color = Gray400
        )

        Column (
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_ticket),
                    tint = Gray500,
                    contentDescription = "Icone Cupons"
                )

                Text(
                    text = "${market.coupons} cupons disponiveis",
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    tint = Gray500,
                    contentDescription = "Icone Endereço"
                )

                Text(
                    text = market.address,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_phone),
                    tint = Gray500,
                    contentDescription = "Icone Telefone"
                )

                Text(
                    text = market.phone,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }
        }
    }
    
}

@Preview
@Composable
private fun MarketDetailsInfosPreview() {
    NearbyMarketDetailsInfos(
        market = mockMarkets.first()
    )
}