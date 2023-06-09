package com.topic3.android.reddit.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.constraintlayout.compose.ConstraintLayout
import com.topic3.android.reddit.R
import com.topic3.android.reddit.models.SubredditModel

val subreddits = listOf(
    SubredditModel(
        R.string.raywenderlich,
        R.string.members_120k,
        R.string.welcome_to_raywenderlich
    ),
    SubredditModel(
        R.string.programming,
        R.string.members_600k,
        R.string.hello_programmers
    ),
    SubredditModel(
        R.string.android,
        R.string.members_400k,
        R.string.welcome_to_android
    ),
    SubredditModel(
        R.string.androiddev,
        R.string.members_500k,
        R.string.hello_android_devs
    )
)

val mainCommunities = listOf(R.string.all, R.string.public_network)

val communities = listOf(
    R.string.digitalnomad,
    R.string.covid19,
    R.string.memes,
    R.string.humor,
    R.string.worldnews,
    R.string.dogs,
    R.string.cats
)

@Composable
fun SubredditsScreen(modifier: Modifier = Modifier) {
    //TODO add your code here
}

@Composable
fun Subreddit(subredditModel: SubredditModel, modifier: Modifier = Modifier) {
    //TODO add your code here
}

@Composable
fun SubredditBody(subredditModel: SubredditModel, modifier: Modifier = Modifier) {
    //TODO add your code here
}

@Composable
fun SubredditImage(modifier: Modifier) {
    Image(
        painter = ColorPainter(Color.Blue),
        contentDescription = stringResource(id = R.string.subreddit_image),
        modifier = modifier
            .fillMaxWidth()
            .height(30.dp)
    )
}

@Composable
fun SubredditIcon(modifier: Modifier) {
    Icon(
        modifier = modifier,
        tint = Color.LightGray,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_planet),
        contentDescription = stringResource(id = R.string.subreddit_icon),
    )
}

@Composable
fun SubredditName(modifier: Modifier, @StringRes nameStringRes: Int) {
    Text(
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        text = stringResource(nameStringRes),
        color = MaterialTheme.colors.primaryVariant,
        modifier = modifier.padding(4.dp)
    )
}

@Composable
fun SubredditMembers(modifier: Modifier, @StringRes membersStringRes: Int) {
    Text(
        fontSize = 8.sp,
        text = stringResource(membersStringRes),
        color = Color.Gray,
        modifier = modifier
    )
}

@Composable
fun SubredditDescription(modifier: Modifier, @StringRes descriptionStringRes: Int) {
    Text(
        fontSize = 8.sp,
        text = stringResource(descriptionStringRes),
        color = MaterialTheme.colors.primaryVariant,
        modifier = modifier.padding(4.dp)
    )
}

@Composable
fun Community(text: String, modifier: Modifier = Modifier) {
    //TODO add your code here
}

@Composable
fun Communities(modifier: Modifier = Modifier) {
    //TODO add your code here
}

@Preview
@Composable
fun SubredditBodyPreview() {
    SubredditBody(SubredditModel.DEFAULT_SUBREDDIT)
}

@Preview
@Composable
fun SubredditPreview() {
    Subreddit(SubredditModel.DEFAULT_SUBREDDIT)
}

@Preview
@Composable
fun CommunityPreview() {
    Community(stringResource(id = R.string.raywenderlich_com))
}

@Preview
@Composable
fun CommunitiesPreview() {
    Column {
        Communities()
    }
}