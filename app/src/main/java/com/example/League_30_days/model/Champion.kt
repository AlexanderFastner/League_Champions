package com.example.League_30_days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.League_30_days.R

data class Champion (
    val nameResource: Int,
    val titleResource: Int,
    @StringRes val classResource: Int,
    @StringRes val descriptionResource: Int,
    @DrawableRes val imageResource: Int,
)

object ChampionPool{
    val Champions =listOf(
        Champion(
            nameResource = R.string.Aatrox_name,
            titleResource = R.string.Aatrox_title,
            classResource = R.string.Aatrox_tags,
            descriptionResource = R.string.Aatrox_description,
            imageResource = R.drawable.aatrox
        ),

        Champion(
            nameResource = R.string.Ahri_name,
            titleResource = R.string.Ahri_title,
            classResource = R.string.Ahri_tags,
            descriptionResource = R.string.Ahri_description,
            imageResource = R.drawable.ahri
        ),

        Champion(
            nameResource = R.string.Akali_name,
            titleResource = R.string.Akali_title,
            classResource = R.string.Akali_tags,
            descriptionResource = R.string.Akali_description,
            imageResource = R.drawable.akali
        ),

        Champion(
            nameResource = R.string.Alistar_name,
            titleResource = R.string.Alistar_title,
            classResource = R.string.Alistar_tags,
            descriptionResource = R.string.Alistar_description,
            imageResource = R.drawable.alistar
        ),

        Champion(
            nameResource = R.string.Amumu_name,
            titleResource = R.string.Amumu_title,
            classResource = R.string.Amumu_tags,
            descriptionResource = R.string.Amumu_description,
            imageResource = R.drawable.amumu
        ),

        Champion(
            nameResource = R.string.Anivia_name,
            titleResource = R.string.Anivia_title,
            classResource = R.string.Anivia_tags,
            descriptionResource = R.string.Anivia_description,
            imageResource = R.drawable.anivia
        ),

        Champion(
            nameResource = R.string.Annie_name,
            titleResource = R.string.Annie_title,
            classResource = R.string.Annie_tags,
            descriptionResource = R.string.Annie_description,
            imageResource = R.drawable.annie
        ),

        Champion(
            nameResource = R.string.Aphelios_name,
            titleResource = R.string.Aphelios_title,
            classResource = R.string.Aphelios_tags,
            descriptionResource = R.string.Aphelios_description,
            imageResource = R.drawable.aphelios
        ),

        Champion(
            nameResource = R.string.Ashe_name,
            titleResource = R.string.Ashe_title,
            classResource = R.string.Ashe_tags,
            descriptionResource = R.string.Ashe_description,
            imageResource = R.drawable.ashe
        ),

        Champion(
            nameResource = R.string.Aurelion_Sol_name,
            titleResource = R.string.Aurelion_Sol_title,
            classResource = R.string.Aurelion_Sol_tags,
            descriptionResource = R.string.Aurelion_Sol_description,
            imageResource = R.drawable.aurelionsol
        ),

        Champion(
            nameResource = R.string.Azir_name,
            titleResource = R.string.Azir_title,
            classResource = R.string.Azir_tags,
            descriptionResource = R.string.Azir_description,
            imageResource = R.drawable.azir
        ),

        Champion(
            nameResource = R.string.Bard_name,
            titleResource = R.string.Bard_title,
            classResource = R.string.Bard_tags,
            descriptionResource = R.string.Bard_description,
            imageResource = R.drawable.bard
        ),

        Champion(
            nameResource = R.string.Blitzcrank_name,
            titleResource = R.string.Blitzcrank_title,
            classResource = R.string.Blitzcrank_tags,
            descriptionResource = R.string.Blitzcrank_description,
            imageResource = R.drawable.blitzcrank
        ),

        Champion(
            nameResource = R.string.Brand_name,
            titleResource = R.string.Brand_title,
            classResource = R.string.Brand_tags,
            descriptionResource = R.string.Brand_description,
            imageResource = R.drawable.brand
        ),

        Champion(
            nameResource = R.string.Braum_name,
            titleResource = R.string.Braum_title,
            classResource = R.string.Braum_tags,
            descriptionResource = R.string.Braum_description,
            imageResource = R.drawable.braum
        ),

        Champion(
            nameResource = R.string.Caitlyn_name,
            titleResource = R.string.Caitlyn_title,
            classResource = R.string.Caitlyn_tags,
            descriptionResource = R.string.Caitlyn_description,
            imageResource = R.drawable.caitlyn
        ),

        Champion(
            nameResource = R.string.Camille_name,
            titleResource = R.string.Camille_title,
            classResource = R.string.Camille_tags,
            descriptionResource = R.string.Camille_description,
            imageResource = R.drawable.camille
        ),

        Champion(
            nameResource = R.string.Cassiopeia_name,
            titleResource = R.string.Cassiopeia_title,
            classResource = R.string.Cassiopeia_tags,
            descriptionResource = R.string.Cassiopeia_description,
            imageResource = R.drawable.cassiopeia
        ),

        Champion(
            nameResource = R.string.ChoGath_name,
            titleResource = R.string.ChoGath_title,
            classResource = R.string.ChoGath_tags,
            descriptionResource = R.string.ChoGath_description,
            imageResource = R.drawable.chogath
        ),

        Champion(
            nameResource = R.string.Corki_name,
            titleResource = R.string.Corki_title,
            classResource = R.string.Corki_tags,
            descriptionResource = R.string.Corki_description,
            imageResource = R.drawable.corki
        ),

        Champion(
            nameResource = R.string.Darius_name,
            titleResource = R.string.Darius_title,
            classResource = R.string.Darius_tags,
            descriptionResource = R.string.Darius_description,
            imageResource = R.drawable.darius
        ),

        Champion(
            nameResource = R.string.Diana_name,
            titleResource = R.string.Diana_title,
            classResource = R.string.Diana_tags,
            descriptionResource = R.string.Diana_description,
            imageResource = R.drawable.diana
        ),

        Champion(
            nameResource = R.string.Draven_name,
            titleResource = R.string.Draven_title,
            classResource = R.string.Draven_tags,
            descriptionResource = R.string.Draven_description,
            imageResource = R.drawable.draven
        ),

        Champion(
            nameResource = R.string.Dr_Mundo_name,
            titleResource = R.string.Dr_Mundo_title,
            classResource = R.string.Dr_Mundo_tags,
            descriptionResource = R.string.Dr_Mundo_description,
            imageResource = R.drawable.drmundo
        ),

        Champion(
            nameResource = R.string.Ekko_name,
            titleResource = R.string.Ekko_title,
            classResource = R.string.Ekko_tags,
            descriptionResource = R.string.Ekko_description,
            imageResource = R.drawable.ekko
        ),

        Champion(
            nameResource = R.string.Elise_name,
            titleResource = R.string.Elise_title,
            classResource = R.string.Elise_tags,
            descriptionResource = R.string.Elise_description,
            imageResource = R.drawable.elise
        ),

        Champion(
            nameResource = R.string.Evelynn_name,
            titleResource = R.string.Evelynn_title,
            classResource = R.string.Evelynn_tags,
            descriptionResource = R.string.Evelynn_description,
            imageResource = R.drawable.evelynn
        ),

        Champion(
            nameResource = R.string.Ezreal_name,
            titleResource = R.string.Ezreal_title,
            classResource = R.string.Ezreal_tags,
            descriptionResource = R.string.Ezreal_description,
            imageResource = R.drawable.ezreal
        ),

        Champion(
            nameResource = R.string.Fiddlesticks_name,
            titleResource = R.string.Fiddlesticks_title,
            classResource = R.string.Fiddlesticks_tags,
            descriptionResource = R.string.Fiddlesticks_description,
            imageResource = R.drawable.fiddlesticks
        ),

        Champion(
            nameResource = R.string.Fiora_name,
            titleResource = R.string.Fiora_title,
            classResource = R.string.Fiora_tags,
            descriptionResource = R.string.Fiora_description,
            imageResource = R.drawable.fiora
        ),

        Champion(
            nameResource = R.string.Fizz_name,
            titleResource = R.string.Fizz_title,
            classResource = R.string.Fizz_tags,
            descriptionResource = R.string.Fizz_description,
            imageResource = R.drawable.fizz
        ),

        Champion(
            nameResource = R.string.Galio_name,
            titleResource = R.string.Galio_title,
            classResource = R.string.Galio_tags,
            descriptionResource = R.string.Galio_description,
            imageResource = R.drawable.galio
        ),

        Champion(
            nameResource = R.string.Gangplank_name,
            titleResource = R.string.Gangplank_title,
            classResource = R.string.Gangplank_tags,
            descriptionResource = R.string.Gangplank_description,
            imageResource = R.drawable.gangplank
        ),

        Champion(
            nameResource = R.string.Garen_name,
            titleResource = R.string.Garen_title,
            classResource = R.string.Garen_tags,
            descriptionResource = R.string.Garen_description,
            imageResource = R.drawable.garen
        ),

        Champion(
            nameResource = R.string.Gnar_name,
            titleResource = R.string.Gnar_title,
            classResource = R.string.Gnar_tags,
            descriptionResource = R.string.Gnar_description,
            imageResource = R.drawable.gnar
        ),

        Champion(
            nameResource = R.string.Gragas_name,
            titleResource = R.string.Gragas_title,
            classResource = R.string.Gragas_tags,
            descriptionResource = R.string.Gragas_description,
            imageResource = R.drawable.gragas
        ),

        Champion(
            nameResource = R.string.Graves_name,
            titleResource = R.string.Graves_title,
            classResource = R.string.Graves_tags,
            descriptionResource = R.string.Graves_description,
            imageResource = R.drawable.graves
        ),

        Champion(
            nameResource = R.string.Hecarim_name,
            titleResource = R.string.Hecarim_title,
            classResource = R.string.Hecarim_tags,
            descriptionResource = R.string.Hecarim_description,
            imageResource = R.drawable.hecarim
        ),

        Champion(
            nameResource = R.string.Heimerdinger_name,
            titleResource = R.string.Heimerdinger_title,
            classResource = R.string.Heimerdinger_tags,
            descriptionResource = R.string.Heimerdinger_description,
            imageResource = R.drawable.heimerdinger
        ),

        Champion(
            nameResource = R.string.Illaoi_name,
            titleResource = R.string.Illaoi_title,
            classResource = R.string.Illaoi_tags,
            descriptionResource = R.string.Illaoi_description,
            imageResource = R.drawable.illaoi
        ),

        Champion(
            nameResource = R.string.Irelia_name,
            titleResource = R.string.Irelia_title,
            classResource = R.string.Irelia_tags,
            descriptionResource = R.string.Irelia_description,
            imageResource = R.drawable.irelia
        ),

        Champion(
            nameResource = R.string.Ivern_name,
            titleResource = R.string.Ivern_title,
            classResource = R.string.Ivern_tags,
            descriptionResource = R.string.Ivern_description,
            imageResource = R.drawable.ivern
        ),

        Champion(
            nameResource = R.string.Janna_name,
            titleResource = R.string.Janna_title,
            classResource = R.string.Janna_tags,
            descriptionResource = R.string.Janna_description,
            imageResource = R.drawable.janna
        ),

        Champion(
            nameResource = R.string.Jarvan_IV_name,
            titleResource = R.string.Jarvan_IV_title,
            classResource = R.string.Jarvan_IV_tags,
            descriptionResource = R.string.Jarvan_IV_description,
            imageResource = R.drawable.jarvaniv
        ),

        Champion(
            nameResource = R.string.Jax_name,
            titleResource = R.string.Jax_title,
            classResource = R.string.Jax_tags,
            descriptionResource = R.string.Jax_description,
            imageResource = R.drawable.jax
        ),

        Champion(
            nameResource = R.string.Jayce_name,
            titleResource = R.string.Jayce_title,
            classResource = R.string.Jayce_tags,
            descriptionResource = R.string.Jayce_description,
            imageResource = R.drawable.jayce
        ),

        Champion(
            nameResource = R.string.Jhin_name,
            titleResource = R.string.Jhin_title,
            classResource = R.string.Jhin_tags,
            descriptionResource = R.string.Jhin_description,
            imageResource = R.drawable.jhin
        ),

        Champion(
            nameResource = R.string.Jinx_name,
            titleResource = R.string.Jinx_title,
            classResource = R.string.Jinx_tags,
            descriptionResource = R.string.Jinx_description,
            imageResource = R.drawable.jinx
        ),

        Champion(
            nameResource = R.string.KaiSa_name,
            titleResource = R.string.KaiSa_title,
            classResource = R.string.KaiSa_tags,
            descriptionResource = R.string.KaiSa_description,
            imageResource = R.drawable.kaisa
        ),

        Champion(
            nameResource = R.string.Kalista_name,
            titleResource = R.string.Kalista_title,
            classResource = R.string.Kalista_tags,
            descriptionResource = R.string.Kalista_description,
            imageResource = R.drawable.kalista
        ),

        Champion(
            nameResource = R.string.Karma_name,
            titleResource = R.string.Karma_title,
            classResource = R.string.Karma_tags,
            descriptionResource = R.string.Karma_description,
            imageResource = R.drawable.karma
        ),

        Champion(
            nameResource = R.string.Karthus_name,
            titleResource = R.string.Karthus_title,
            classResource = R.string.Karthus_tags,
            descriptionResource = R.string.Karthus_description,
            imageResource = R.drawable.karthus
        ),

        Champion(
            nameResource = R.string.Kassadin_name,
            titleResource = R.string.Kassadin_title,
            classResource = R.string.Kassadin_tags,
            descriptionResource = R.string.Kassadin_description,
            imageResource = R.drawable.kassadin
        ),

        Champion(
            nameResource = R.string.Katarina_name,
            titleResource = R.string.Katarina_title,
            classResource = R.string.Katarina_tags,
            descriptionResource = R.string.Katarina_description,
            imageResource = R.drawable.katarina
        ),

        Champion(
            nameResource = R.string.Kayle_name,
            titleResource = R.string.Kayle_title,
            classResource = R.string.Kayle_tags,
            descriptionResource = R.string.Kayle_description,
            imageResource = R.drawable.kayle
        ),

        Champion(
            nameResource = R.string.Kayn_name,
            titleResource = R.string.Kayn_title,
            classResource = R.string.Kayn_tags,
            descriptionResource = R.string.Kayn_description,
            imageResource = R.drawable.kayn
        ),

        Champion(
            nameResource = R.string.Kennen_name,
            titleResource = R.string.Kennen_title,
            classResource = R.string.Kennen_tags,
            descriptionResource = R.string.Kennen_description,
            imageResource = R.drawable.kennen
        ),

        Champion(
            nameResource = R.string.KhaZix_name,
            titleResource = R.string.KhaZix_title,
            classResource = R.string.KhaZix_tags,
            descriptionResource = R.string.KhaZix_description,
            imageResource = R.drawable.khazix
        ),

        Champion(
            nameResource = R.string.Kindred_name,
            titleResource = R.string.Kindred_title,
            classResource = R.string.Kindred_tags,
            descriptionResource = R.string.Kindred_description,
            imageResource = R.drawable.kindred
        ),

        Champion(
            nameResource = R.string.Kled_name,
            titleResource = R.string.Kled_title,
            classResource = R.string.Kled_tags,
            descriptionResource = R.string.Kled_description,
            imageResource = R.drawable.kled
        ),

        Champion(
            nameResource = R.string.KogMaw_name,
            titleResource = R.string.KogMaw_title,
            classResource = R.string.KogMaw_tags,
            descriptionResource = R.string.KogMaw_description,
            imageResource = R.drawable.kogmaw
        ),

        Champion(
            nameResource = R.string.LeBlanc_name,
            titleResource = R.string.LeBlanc_title,
            classResource = R.string.LeBlanc_tags,
            descriptionResource = R.string.LeBlanc_description,
            imageResource = R.drawable.leblanc
        ),

        Champion(
            nameResource = R.string.Lee_Sin_name,
            titleResource = R.string.Lee_Sin_title,
            classResource = R.string.Lee_Sin_tags,
            descriptionResource = R.string.Lee_Sin_description,
            imageResource = R.drawable.leesin
        ),

        Champion(
            nameResource = R.string.Leona_name,
            titleResource = R.string.Leona_title,
            classResource = R.string.Leona_tags,
            descriptionResource = R.string.Leona_description,
            imageResource = R.drawable.leona
        ),

        Champion(
            nameResource = R.string.Lillia_name,
            titleResource = R.string.Lillia_title,
            classResource = R.string.Lillia_tags,
            descriptionResource = R.string.Lillia_description,
            imageResource = R.drawable.lillia
        ),

        Champion(
            nameResource = R.string.Lissandra_name,
            titleResource = R.string.Lissandra_title,
            classResource = R.string.Lissandra_tags,
            descriptionResource = R.string.Lissandra_description,
            imageResource = R.drawable.lissandra
        ),

        Champion(
            nameResource = R.string.Lucian_name,
            titleResource = R.string.Lucian_title,
            classResource = R.string.Lucian_tags,
            descriptionResource = R.string.Lucian_description,
            imageResource = R.drawable.lucian
        ),

        Champion(
            nameResource = R.string.Lulu_name,
            titleResource = R.string.Lulu_title,
            classResource = R.string.Lulu_tags,
            descriptionResource = R.string.Lulu_description,
            imageResource = R.drawable.lulu
        ),

        Champion(
            nameResource = R.string.Lux_name,
            titleResource = R.string.Lux_title,
            classResource = R.string.Lux_tags,
            descriptionResource = R.string.Lux_description,
            imageResource = R.drawable.lux
        ),

        Champion(
            nameResource = R.string.Malphite_name,
            titleResource = R.string.Malphite_title,
            classResource = R.string.Malphite_tags,
            descriptionResource = R.string.Malphite_description,
            imageResource = R.drawable.malphite
        ),

        Champion(
            nameResource = R.string.Malzahar_name,
            titleResource = R.string.Malzahar_title,
            classResource = R.string.Malzahar_tags,
            descriptionResource = R.string.Malzahar_description,
            imageResource = R.drawable.malzahar
        ),

        Champion(
            nameResource = R.string.Maokai_name,
            titleResource = R.string.Maokai_title,
            classResource = R.string.Maokai_tags,
            descriptionResource = R.string.Maokai_description,
            imageResource = R.drawable.maokai
        ),

        Champion(
            nameResource = R.string.Master_Yi_name,
            titleResource = R.string.Master_Yi_title,
            classResource = R.string.Master_Yi_tags,
            descriptionResource = R.string.Master_Yi_description,
            imageResource = R.drawable.masteryi
        ),

        Champion(
            nameResource = R.string.Miss_Fortune_name,
            titleResource = R.string.Miss_Fortune_title,
            classResource = R.string.Miss_Fortune_tags,
            descriptionResource = R.string.Miss_Fortune_description,
            imageResource = R.drawable.missfortune
        ),

        Champion(
            nameResource = R.string.Wukong_name,
            titleResource = R.string.Wukong_title,
            classResource = R.string.Wukong_tags,
            descriptionResource = R.string.Wukong_description,
            imageResource = R.drawable.wukong
        ),

        Champion(
            nameResource = R.string.Mordekaiser_name,
            titleResource = R.string.Mordekaiser_title,
            classResource = R.string.Mordekaiser_tags,
            descriptionResource = R.string.Mordekaiser_description,
            imageResource = R.drawable.mordekaiser
        ),

        Champion(
            nameResource = R.string.Morgana_name,
            titleResource = R.string.Morgana_title,
            classResource = R.string.Morgana_tags,
            descriptionResource = R.string.Morgana_description,
            imageResource = R.drawable.morgana
        ),

        Champion(
            nameResource = R.string.Nami_name,
            titleResource = R.string.Nami_title,
            classResource = R.string.Nami_tags,
            descriptionResource = R.string.Nami_description,
            imageResource = R.drawable.nami
        ),

        Champion(
            nameResource = R.string.Nasus_name,
            titleResource = R.string.Nasus_title,
            classResource = R.string.Nasus_tags,
            descriptionResource = R.string.Nasus_description,
            imageResource = R.drawable.nasus
        ),

        Champion(
            nameResource = R.string.Nautilus_name,
            titleResource = R.string.Nautilus_title,
            classResource = R.string.Nautilus_tags,
            descriptionResource = R.string.Nautilus_description,
            imageResource = R.drawable.nautilus
        ),

        Champion(
            nameResource = R.string.Neeko_name,
            titleResource = R.string.Neeko_title,
            classResource = R.string.Neeko_tags,
            descriptionResource = R.string.Neeko_description,
            imageResource = R.drawable.neeko
        ),

        Champion(
            nameResource = R.string.Nidalee_name,
            titleResource = R.string.Nidalee_title,
            classResource = R.string.Nidalee_tags,
            descriptionResource = R.string.Nidalee_description,
            imageResource = R.drawable.nidalee
        ),

        Champion(
            nameResource = R.string.Nocturne_name,
            titleResource = R.string.Nocturne_title,
            classResource = R.string.Nocturne_tags,
            descriptionResource = R.string.Nocturne_description,
            imageResource = R.drawable.nocturne
        ),

        Champion(
            nameResource = R.string.Nunu_and_Willump_name,
            titleResource = R.string.Nunu_and_Willump_title,
            classResource = R.string.Nunu_and_Willump_tags,
            descriptionResource = R.string.Nunu_and_Willump_description,
            imageResource = R.drawable.nunu
        ),

        Champion(
            nameResource = R.string.Olaf_name,
            titleResource = R.string.Olaf_title,
            classResource = R.string.Olaf_tags,
            descriptionResource = R.string.Olaf_description,
            imageResource = R.drawable.olaf
        ),

        Champion(
            nameResource = R.string.Orianna_name,
            titleResource = R.string.Orianna_title,
            classResource = R.string.Orianna_tags,
            descriptionResource = R.string.Orianna_description,
            imageResource = R.drawable.orianna
        ),

        Champion(
            nameResource = R.string.Ornn_name,
            titleResource = R.string.Ornn_title,
            classResource = R.string.Ornn_tags,
            descriptionResource = R.string.Ornn_description,
            imageResource = R.drawable.ornn
        ),

        Champion(
            nameResource = R.string.Pantheon_name,
            titleResource = R.string.Pantheon_title,
            classResource = R.string.Pantheon_tags,
            descriptionResource = R.string.Pantheon_description,
            imageResource = R.drawable.pantheon
        ),

        Champion(
            nameResource = R.string.Poppy_name,
            titleResource = R.string.Poppy_title,
            classResource = R.string.Poppy_tags,
            descriptionResource = R.string.Poppy_description,
            imageResource = R.drawable.poppy
        ),

        Champion(
            nameResource = R.string.Pyke_name,
            titleResource = R.string.Pyke_title,
            classResource = R.string.Pyke_tags,
            descriptionResource = R.string.Pyke_description,
            imageResource = R.drawable.pyke
        ),

        Champion(
            nameResource = R.string.Qiyana_name,
            titleResource = R.string.Qiyana_title,
            classResource = R.string.Qiyana_tags,
            descriptionResource = R.string.Qiyana_description,
            imageResource = R.drawable.qiyana
        ),

        Champion(
            nameResource = R.string.Quinn_name,
            titleResource = R.string.Quinn_title,
            classResource = R.string.Quinn_tags,
            descriptionResource = R.string.Quinn_description,
            imageResource = R.drawable.quinn
        ),

        Champion(
            nameResource = R.string.Rakan_name,
            titleResource = R.string.Rakan_title,
            classResource = R.string.Rakan_tags,
            descriptionResource = R.string.Rakan_description,
            imageResource = R.drawable.rakan
        ),

        Champion(
            nameResource = R.string.Rammus_name,
            titleResource = R.string.Rammus_title,
            classResource = R.string.Rammus_tags,
            descriptionResource = R.string.Rammus_description,
            imageResource = R.drawable.rammus
        ),

        Champion(
            nameResource = R.string.RekSai_name,
            titleResource = R.string.RekSai_title,
            classResource = R.string.RekSai_tags,
            descriptionResource = R.string.RekSai_description,
            imageResource = R.drawable.reksai
        ),

        Champion(
            nameResource = R.string.Renekton_name,
            titleResource = R.string.Renekton_title,
            classResource = R.string.Renekton_tags,
            descriptionResource = R.string.Renekton_description,
            imageResource = R.drawable.renekton
        ),

        Champion(
            nameResource = R.string.Rengar_name,
            titleResource = R.string.Rengar_title,
            classResource = R.string.Rengar_tags,
            descriptionResource = R.string.Rengar_description,
            imageResource = R.drawable.rengar
        ),

        Champion(
            nameResource = R.string.Riven_name,
            titleResource = R.string.Riven_title,
            classResource = R.string.Riven_tags,
            descriptionResource = R.string.Riven_description,
            imageResource = R.drawable.riven
        ),

        Champion(
            nameResource = R.string.Rumble_name,
            titleResource = R.string.Rumble_title,
            classResource = R.string.Rumble_tags,
            descriptionResource = R.string.Rumble_description,
            imageResource = R.drawable.rumble
        ),

        Champion(
            nameResource = R.string.Ryze_name,
            titleResource = R.string.Ryze_title,
            classResource = R.string.Ryze_tags,
            descriptionResource = R.string.Ryze_description,
            imageResource = R.drawable.ryze
        ),

        Champion(
            nameResource = R.string.Samira_name,
            titleResource = R.string.Samira_title,
            classResource = R.string.Samira_tags,
            descriptionResource = R.string.Samira_description,
            imageResource = R.drawable.samira
        ),

        Champion(
            nameResource = R.string.Sejuani_name,
            titleResource = R.string.Sejuani_title,
            classResource = R.string.Sejuani_tags,
            descriptionResource = R.string.Sejuani_description,
            imageResource = R.drawable.sejuani
        ),

        Champion(
            nameResource = R.string.Senna_name,
            titleResource = R.string.Senna_title,
            classResource = R.string.Senna_tags,
            descriptionResource = R.string.Senna_description,
            imageResource = R.drawable.senna
        ),

        Champion(
            nameResource = R.string.Seraphine_name,
            titleResource = R.string.Seraphine_title,
            classResource = R.string.Seraphine_tags,
            descriptionResource = R.string.Seraphine_description,
            imageResource = R.drawable.seraphine
        ),

        Champion(
            nameResource = R.string.Sett_name,
            titleResource = R.string.Sett_title,
            classResource = R.string.Sett_tags,
            descriptionResource = R.string.Sett_description,
            imageResource = R.drawable.sett
        ),

        Champion(
            nameResource = R.string.Shaco_name,
            titleResource = R.string.Shaco_title,
            classResource = R.string.Shaco_tags,
            descriptionResource = R.string.Shaco_description,
            imageResource = R.drawable.shaco
        ),

        Champion(
            nameResource = R.string.Shen_name,
            titleResource = R.string.Shen_title,
            classResource = R.string.Shen_tags,
            descriptionResource = R.string.Shen_description,
            imageResource = R.drawable.shen
        ),

        Champion(
            nameResource = R.string.Shyvana_name,
            titleResource = R.string.Shyvana_title,
            classResource = R.string.Shyvana_tags,
            descriptionResource = R.string.Shyvana_description,
            imageResource = R.drawable.shyvana
        ),

        Champion(
            nameResource = R.string.Singed_name,
            titleResource = R.string.Singed_title,
            classResource = R.string.Singed_tags,
            descriptionResource = R.string.Singed_description,
            imageResource = R.drawable.singed
        ),

        Champion(
            nameResource = R.string.Sion_name,
            titleResource = R.string.Sion_title,
            classResource = R.string.Sion_tags,
            descriptionResource = R.string.Sion_description,
            imageResource = R.drawable.sion
        ),

        Champion(
            nameResource = R.string.Sivir_name,
            titleResource = R.string.Sivir_title,
            classResource = R.string.Sivir_tags,
            descriptionResource = R.string.Sivir_description,
            imageResource = R.drawable.sivir
        ),

        Champion(
            nameResource = R.string.Skarner_name,
            titleResource = R.string.Skarner_title,
            classResource = R.string.Skarner_tags,
            descriptionResource = R.string.Skarner_description,
            imageResource = R.drawable.skarner
        ),

        Champion(
            nameResource = R.string.Sona_name,
            titleResource = R.string.Sona_title,
            classResource = R.string.Sona_tags,
            descriptionResource = R.string.Sona_description,
            imageResource = R.drawable.sona
        ),

        Champion(
            nameResource = R.string.Soraka_name,
            titleResource = R.string.Soraka_title,
            classResource = R.string.Soraka_tags,
            descriptionResource = R.string.Soraka_description,
            imageResource = R.drawable.soraka
        ),

        Champion(
            nameResource = R.string.Swain_name,
            titleResource = R.string.Swain_title,
            classResource = R.string.Swain_tags,
            descriptionResource = R.string.Swain_description,
            imageResource = R.drawable.swain
        ),

        Champion(
            nameResource = R.string.Sylas_name,
            titleResource = R.string.Sylas_title,
            classResource = R.string.Sylas_tags,
            descriptionResource = R.string.Sylas_description,
            imageResource = R.drawable.sylas
        ),

        Champion(
            nameResource = R.string.Syndra_name,
            titleResource = R.string.Syndra_title,
            classResource = R.string.Syndra_tags,
            descriptionResource = R.string.Syndra_description,
            imageResource = R.drawable.syndra
        ),

        Champion(
            nameResource = R.string.Tahm_Kench_name,
            titleResource = R.string.Tahm_Kench_title,
            classResource = R.string.Tahm_Kench_tags,
            descriptionResource = R.string.Tahm_Kench_description,
            imageResource = R.drawable.tahmkench
        ),

        Champion(
            nameResource = R.string.Taliyah_name,
            titleResource = R.string.Taliyah_title,
            classResource = R.string.Taliyah_tags,
            descriptionResource = R.string.Taliyah_description,
            imageResource = R.drawable.taliyah
        ),

        Champion(
            nameResource = R.string.Talon_name,
            titleResource = R.string.Talon_title,
            classResource = R.string.Talon_tags,
            descriptionResource = R.string.Talon_description,
            imageResource = R.drawable.talon
        ),

        Champion(
            nameResource = R.string.Taric_name,
            titleResource = R.string.Taric_title,
            classResource = R.string.Taric_tags,
            descriptionResource = R.string.Taric_description,
            imageResource = R.drawable.taric
        ),

        Champion(
            nameResource = R.string.Teemo_name,
            titleResource = R.string.Teemo_title,
            classResource = R.string.Teemo_tags,
            descriptionResource = R.string.Teemo_description,
            imageResource = R.drawable.teemo
        ),

        Champion(
            nameResource = R.string.Thresh_name,
            titleResource = R.string.Thresh_title,
            classResource = R.string.Thresh_tags,
            descriptionResource = R.string.Thresh_description,
            imageResource = R.drawable.thresh
        ),

        Champion(
            nameResource = R.string.Tristana_name,
            titleResource = R.string.Tristana_title,
            classResource = R.string.Tristana_tags,
            descriptionResource = R.string.Tristana_description,
            imageResource = R.drawable.tristana
        ),

        Champion(
            nameResource = R.string.Trundle_name,
            titleResource = R.string.Trundle_title,
            classResource = R.string.Trundle_tags,
            descriptionResource = R.string.Trundle_description,
            imageResource = R.drawable.trundle
        ),

        Champion(
            nameResource = R.string.Tryndamere_name,
            titleResource = R.string.Tryndamere_title,
            classResource = R.string.Tryndamere_tags,
            descriptionResource = R.string.Tryndamere_description,
            imageResource = R.drawable.tryndamere
        ),

        Champion(
            nameResource = R.string.Twisted_Fate_name,
            titleResource = R.string.Twisted_Fate_title,
            classResource = R.string.Twisted_Fate_tags,
            descriptionResource = R.string.Twisted_Fate_description,
            imageResource = R.drawable.twistedfate
        ),

        Champion(
            nameResource = R.string.Twitch_name,
            titleResource = R.string.Twitch_title,
            classResource = R.string.Twitch_tags,
            descriptionResource = R.string.Twitch_description,
            imageResource = R.drawable.twitch
        ),

        Champion(
            nameResource = R.string.Udyr_name,
            titleResource = R.string.Udyr_title,
            classResource = R.string.Udyr_tags,
            descriptionResource = R.string.Udyr_description,
            imageResource = R.drawable.udyr
        ),

        Champion(
            nameResource = R.string.Urgot_name,
            titleResource = R.string.Urgot_title,
            classResource = R.string.Urgot_tags,
            descriptionResource = R.string.Urgot_description,
            imageResource = R.drawable.urgot
        ),

        Champion(
            nameResource = R.string.Varus_name,
            titleResource = R.string.Varus_title,
            classResource = R.string.Varus_tags,
            descriptionResource = R.string.Varus_description,
            imageResource = R.drawable.varus
        ),

        Champion(
            nameResource = R.string.Vayne_name,
            titleResource = R.string.Vayne_title,
            classResource = R.string.Vayne_tags,
            descriptionResource = R.string.Vayne_description,
            imageResource = R.drawable.vayne
        ),

        Champion(
            nameResource = R.string.Veigar_name,
            titleResource = R.string.Veigar_title,
            classResource = R.string.Veigar_tags,
            descriptionResource = R.string.Veigar_description,
            imageResource = R.drawable.veigar
        ),

        Champion(
            nameResource = R.string.VelKoz_name,
            titleResource = R.string.VelKoz_title,
            classResource = R.string.VelKoz_tags,
            descriptionResource = R.string.VelKoz_description,
            imageResource = R.drawable.velkoz
        ),

        Champion(
            nameResource = R.string.Vi_name,
            titleResource = R.string.Vi_title,
            classResource = R.string.Vi_tags,
            descriptionResource = R.string.Vi_description,
            imageResource = R.drawable.vi
        ),

        Champion(
            nameResource = R.string.Viktor_name,
            titleResource = R.string.Viktor_title,
            classResource = R.string.Viktor_tags,
            descriptionResource = R.string.Viktor_description,
            imageResource = R.drawable.viktor
        ),

        Champion(
            nameResource = R.string.Vladimir_name,
            titleResource = R.string.Vladimir_title,
            classResource = R.string.Vladimir_tags,
            descriptionResource = R.string.Vladimir_description,
            imageResource = R.drawable.vladimir
        ),

        Champion(
            nameResource = R.string.Volibear_name,
            titleResource = R.string.Volibear_title,
            classResource = R.string.Volibear_tags,
            descriptionResource = R.string.Volibear_description,
            imageResource = R.drawable.volibear
        ),

        Champion(
            nameResource = R.string.Warwick_name,
            titleResource = R.string.Warwick_title,
            classResource = R.string.Warwick_tags,
            descriptionResource = R.string.Warwick_description,
            imageResource = R.drawable.warwick
        ),

        Champion(
            nameResource = R.string.Xayah_name,
            titleResource = R.string.Xayah_title,
            classResource = R.string.Xayah_tags,
            descriptionResource = R.string.Xayah_description,
            imageResource = R.drawable.xayah
        ),

        Champion(
            nameResource = R.string.Xerath_name,
            titleResource = R.string.Xerath_title,
            classResource = R.string.Xerath_tags,
            descriptionResource = R.string.Xerath_description,
            imageResource = R.drawable.xerath
        ),

        Champion(
            nameResource = R.string.Xin_Zhao_name,
            titleResource = R.string.Xin_Zhao_title,
            classResource = R.string.Xin_Zhao_tags,
            descriptionResource = R.string.Xin_Zhao_description,
            imageResource = R.drawable.xinzhao
        ),

        Champion(
            nameResource = R.string.Yasuo_name,
            titleResource = R.string.Yasuo_title,
            classResource = R.string.Yasuo_tags,
            descriptionResource = R.string.Yasuo_description,
            imageResource = R.drawable.yasuo
        ),

        Champion(
            nameResource = R.string.Yone_name,
            titleResource = R.string.Yone_title,
            classResource = R.string.Yone_tags,
            descriptionResource = R.string.Yone_description,
            imageResource = R.drawable.yone
        ),

        Champion(
            nameResource = R.string.Yorick_name,
            titleResource = R.string.Yorick_title,
            classResource = R.string.Yorick_tags,
            descriptionResource = R.string.Yorick_description,
            imageResource = R.drawable.yorick
        ),

        Champion(
            nameResource = R.string.Yuumi_name,
            titleResource = R.string.Yuumi_title,
            classResource = R.string.Yuumi_tags,
            descriptionResource = R.string.Yuumi_description,
            imageResource = R.drawable.yuumi
        ),

        Champion(
            nameResource = R.string.Zac_name,
            titleResource = R.string.Zac_title,
            classResource = R.string.Zac_tags,
            descriptionResource = R.string.Zac_description,
            imageResource = R.drawable.zac
        ),

        Champion(
            nameResource = R.string.Zed_name,
            titleResource = R.string.Zed_title,
            classResource = R.string.Zed_tags,
            descriptionResource = R.string.Zed_description,
            imageResource = R.drawable.zed
        ),

        Champion(
            nameResource = R.string.Ziggs_name,
            titleResource = R.string.Ziggs_title,
            classResource = R.string.Ziggs_tags,
            descriptionResource = R.string.Ziggs_description,
            imageResource = R.drawable.ziggs
        ),

        Champion(
            nameResource = R.string.Zilean_name,
            titleResource = R.string.Zilean_title,
            classResource = R.string.Zilean_tags,
            descriptionResource = R.string.Zilean_description,
            imageResource = R.drawable.zilean
        ),

        Champion(
            nameResource = R.string.Zoe_name,
            titleResource = R.string.Zoe_title,
            classResource = R.string.Zoe_tags,
            descriptionResource = R.string.Zoe_description,
            imageResource = R.drawable.zoe
        ),

        Champion(
            nameResource = R.string.Zyra_name,
            titleResource = R.string.Zyra_title,
            classResource = R.string.Zyra_tags,
            descriptionResource = R.string.Zyra_description,
            imageResource = R.drawable.zyra
        ),


        )
}