package br.gov.cmb.cea.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.gov.cmb.cea.model.Afastamento;

public class FormatarDescricaoLdap {
	
	private static final int tdf = 41;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public String formatarDescricao(String inicio, String fim) {
		return "#[FÉRIAS] DE " + inicio + " ATÉ " + fim + " - ";
	}

	public String excluirDescricaoFormatada(String descricao) {
		String descricaoComformatacao = descricao.substring(0, tdf);
		return descricao.replace(descricaoComformatacao, "");
	}

	public boolean deFerias(Afastamento afastamento) {
		LocalDate dataHoje = LocalDate.now();
		if ((dataHoje.isAfter(LocalDate.parse(afastamento.getId().getInicio(),formatter)) || dataHoje.equals(LocalDate.parse(afastamento.getId().getInicio(),formatter)))
				&& (dataHoje.isBefore(LocalDate.parse(afastamento.getFim(),formatter)) || dataHoje.equals(LocalDate.parse(afastamento.getFim(),formatter)))) {
			return true;
		} else {
			return false;
		}
	}

}
