package nextstep.payments.ui.card.newcard.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import nextstep.payments.ui.card.list.CardListUiState
import nextstep.payments.ui.component.PaymentCard

@Composable
fun ManyCardScree(
    modifier: Modifier = Modifier,
    state: CardListUiState.Many,
) {
    Column(modifier = modifier) {
        LazyColumn(
            contentPadding = PaddingValues(vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            items(state.cards) {
                PaymentCard(card = it)
            }
        }
    }
}
