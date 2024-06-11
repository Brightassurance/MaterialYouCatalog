package wonky.product.materialyoucatalog.ui.screen.communication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import wonky.product.materialyoucatalog.R
import wonky.product.materialyoucatalog.ui.components.communication.MYLinearProgressIndicator
import wonky.product.materialyoucatalog.ui.screen.MaterialContents
import wonky.product.materialyoucatalog.ui.screen.MaterialElementScreen
import wonky.product.materialyoucatalog.ui.screen.Overview

@Composable
fun SnakeBarScreen() {

    var determinateLinearIndicatorProgress by remember { mutableStateOf(0f) }
    var determinateCircularIndicatorProgress by remember { mutableStateOf(0f) }

    MaterialContents {
        Overview(stringResource(R.string.overview_snakebar))
        MaterialElementScreen(
            title = "SnakeBar",
            componentContent = {
                MYLinearProgressIndicator()
            },
            controlContent = {

            }
        )

    }
}